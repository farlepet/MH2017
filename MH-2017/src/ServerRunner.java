import java.io.IOException;

class ServerRunner {
    public static void main(String[] args) throws IOException{
        SafetyPlaybookServer srv = new SafetyPlaybookServer(4040);

        srv.start();
    }
}