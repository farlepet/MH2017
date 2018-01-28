
import java.awt.geom.Point2D;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.*;

/*
    This class defines an offensive formation
 */
public class Offense extends Formation
{
    public Offense(Team team)
    {
        super(team);
    }
    
    //Adds a player and checks that it is above the y-axis, and that it's position
    //is offensive
    @Override
    public void addPlayer(Player player, TeamPositions teamPosition, Point2D.Double location)
    {
        if (location.y<0)
            {
                JOptionPane.showMessageDialog(new JFrame(), "You cannot put a offenseman there!",
                    "Illegal placement", JOptionPane.WARNING_MESSAGE);
                return;
            }
        if (!teamPosition.getOffense())
                throw new IllegalArgumentException(
                    "Cannot add defensive player to offensive formation");
        super.addPlayer(player, teamPosition, location);
    }
    
    public RiskFactor[] getRiskLevels(Defense opposingTeam)
    {
        Set<Entry<Integer,PlayerEntry>> offenseSet = this.getHashMap().entrySet();
        Set<Entry<Integer,PlayerEntry>> defenseSet = opposingTeam.getHashMap().entrySet();
        RiskFactor[] output = new RiskFactor[offenseSet.size()];
        int i=0;
        //Increments through every entry in the offensive set
        for (Map.Entry<Integer,PlayerEntry> offensiveEntry : offenseSet)
        {
            double thisDangerValue=0.0;//offensiveEntry.getValue().getPlayer().riskAgainst();
            //Increments through every entry in the defensive set
            for (Map.Entry<Integer,PlayerEntry> defensiveEntry : defenseSet)
            {
                for (TeamPositions position :offensiveEntry.getValue().getTeamPositions().getRiskPositions())
                {
                    //Checks if the offensive entry contains the current defensive entry in its teampositions list
                    if (position.equals(defensiveEntry.getValue().getTeamPositions()))
                    {
                        double thisPairingDanger=offensiveEntry.getValue().getPlayer().riskAgainst(defensiveEntry.getValue().getPlayer());
                        thisPairingDanger=thisPairingDanger/offensiveEntry.getValue().getLocation().distance(defensiveEntry.getValue().getLocation());
                        thisDangerValue+=thisPairingDanger;
                    }
                }
            }
            output[i]=new RiskFactor(thisDangerValue,offensiveEntry.getValue());
            i++;
        }
        return output;
    }
}