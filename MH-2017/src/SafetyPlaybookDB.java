import java.util.*;

class SafetyPlaybookDB {
    private static SafetyPlaybookDB instance = null;
    
    public SafetyPlaybookDB() {

    }

    public Player getPlayer(int teamID, int number) {
        return null;
    }

    public Team getTeam(int teamID) {
        return null;
    }

    public Map<Integer, String> getTeams() {
        Map<Integer, String> map = new HashMap<Integer, String>();

        return map;



        //return null;
    }

    public static SafetyPlaybookDB getInstance() {
        if(SafetyPlaybookDB.instance == null) {
            SafetyPlaybookDB.instance = new SafetyPlaybookDB();
        }

        return SafetyPlaybookDB.instance;
    }
}