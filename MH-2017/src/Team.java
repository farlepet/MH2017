/*
    This abstract class contains a list of players and their positions.

    Instance Data:
        roster: An arraylist which contains a list of all the players on a team
        along with their position.
 */

import java.util.ArrayList;
import java.util.Vector;

public abstract class Team
{
    private ArrayList<PlayerEntry> roster;
    
    /*
    This subclass contains references to a player and an integer.
    
    Instance Data:
        player: The player who is being referenced
        teamPosition: The name of the position that they play on the field
        location: The (x,y) coordinates of a player on the field, relative to
        the ball.
            NOTE: ASSUME THE OFFEENSE IS ALWAYS POSITIVE ON THE Y AXIS
    */
    private class PlayerEntry
    {
        private Player player;
        private TeamPositions teamPosition;
        private Vector<Double> location;
        
        public PlayerEntry(Player player, TeamPositions teamPosition, Vector<Double> location)
        {
            
        }
    }
}
