/*
    This abstract class contains a list of players and their positions.

    Instance Data:
        roster: An arraylist which contains a list of all the players on a team
        along with their position.
 */

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Vector;

public abstract class Formation
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
        private Point2D.Double location;
        
        public PlayerEntry(Player player, TeamPositions teamPosition, Point2D.Double location)
        {
            if (location.x<-25.56 || location.x>26.65)
            {
                throw new IllegalArgumentException(
                "Player "+player.getName()+" has an invalid X position.");
            }
            
            this.player=player;
            this.teamPosition=teamPosition;
            this.location=location;
            
        }
    }
}
