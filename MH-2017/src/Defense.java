
import java.awt.geom.Point2D;
import java.util.Map;
import java.util.Set;

/*
    This class defines a defensive formation.
 */
public class Defense extends Formation
{
    
    public Defense(Team team)
    {
        super(team);
    }

    //Adds a player and checks that it is above the y-axis, and that it's position
    //is defensive
    @Override
    public void addPlayer(Player player, TeamPositions teamPosition, Point2D.Double location)
    {
        if (location.y>0)
            {
                throw new IllegalArgumentException(
                "Player "+player.getName()+" has an invalid Y position.");
            }
        if (teamPosition.getOffense())
                throw new IllegalArgumentException(
                    "Cannot add defensive player to offensive formation");
        super.addPlayer(player, teamPosition, location);
    }

    public RiskFactor[] getRiskLevels(Formation opposingTeam)
    {
        Set<Map.Entry<Integer,PlayerEntry>> defenseSet = this.getHashMap().entrySet();
        Set<Map.Entry<Integer,PlayerEntry>> offenseSet = opposingTeam.getHashMap().entrySet();
        return super.getRiskFactor(offenseSet,defenseSet);
    }
}
