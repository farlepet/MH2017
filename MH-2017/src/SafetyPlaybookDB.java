import java.util.*;

// NOTE: Currently not using a real DB

class SafetyPlaybookDB {
    private static SafetyPlaybookDB instance = null;
    
    int nextTeamID;

    private Map<Integer, Team> teams;

    public SafetyPlaybookDB() {
        this.nextTeamID = 0;
        teams = new HashMap<Integer, Team>();
    }

    public Player getPlayer(int teamID, int number) {
        if(!this.teams.containsKey(teamID)) {
            return null;
        }
        
        return this.teams.get(teamID).getPlayer(number);
    }

    public Team getTeam(int teamID) {
        if(!this.teams.containsKey(teamID)) {
            return null;
        }

        return this.teams.get(teamID);
    }

    public Map<Integer, Team> getTeams() {
        return this.teams;
    }

    public static SafetyPlaybookDB getInstance() {
        if(SafetyPlaybookDB.instance == null) {
            SafetyPlaybookDB.instance = new SafetyPlaybookDB();
        }

        return SafetyPlaybookDB.instance;
    }

    public boolean addPlayer(int teamID, Player player) {
        if(!this.teams.containsKey(teamID)) {
            return false;
        }

        this.teams.get(teamID).addPlayer(player);
        return true;
    }

    public int addTeam(Team team) {
        this.teams.put(this.nextTeamID, team);
        this.nextTeamID++;
        return this.nextTeamID - 1;
    }
}