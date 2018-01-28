import com.sun.net.httpserver.*;
import java.net.InetSocketAddress;
import java.util.*;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

class SafetyPlaybookServer {
    private HttpServer server;

    private Map<String, String> queryToMap(String query){
        Map<String, String> result = new HashMap<String, String>();
        for (String param : query.split("&")) {
            String pair[] = param.split("=");
            if (pair.length>1) {
                result.put(pair[0], pair[1]);
            }else{
                result.put(pair[0], "");
            }
        }
        return result;
    }

    private class requestHandler implements HttpHandler {
        
        public void handle(HttpExchange exchange) throws IOException {
            String query = exchange.getRequestURI().getQuery();
            Map<String, String> q = queryToMap(query);

            String response = "{";

            if(!q.containsKey("r")) {
                response += je("No request!");
            } else {
                response += this.handleRequest(q);
            }

            response += "}";
            //String response = "This is the query: " + query;
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }

        private String handleRequest(Map<String,String> q) {
            String response = "";
            String r = q.get("r");

            if(r.equals("getTeams")) {
                response += "\"teams\": [";

                Map<Integer, Team> teams = SafetyPlaybookDB.getInstance().getTeams();
                for(Map.Entry<Integer, Team> entry : teams.entrySet()) {
                    response += jst(entry.getKey().toString(), entry.getValue().getName()) + ",";
                }

                response += "]";
            } else {
                response += je("Unhandled request: " + r);
            }

            return response;
        }

        private String jst(String key, String value) {
            return "\"" + key + "\": \"" + value + "\"";
        }

        private String je(String error) {
            return jst("error", error);
        }
    }

    /**
     * Setup server
     * 
     * @param port Port number to use
     */
    public SafetyPlaybookServer(int port) throws IOException {
        this.server = HttpServer.create(new InetSocketAddress(port), 0);

        this.server.createContext("/", new requestHandler());
    }

    public void start() {
        this.server.setExecutor(null);
        this.server.start();
    }
}