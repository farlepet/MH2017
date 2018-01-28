/*
    This abstract class contains a list of players and their positions.

    Instance Data:
        roster: An arraylist which contains a list of all the players on a team
        along with their position.
        team: The team which the roster uses.
 */

import java.awt.geom.Point2D;
import java.util.HashMap;
import java.util.Vector;

public abstract class Formation
{
    private HashMap<Integer,PlayerEntry> roster;
    private Team team;
    
    public Formation(Team team)
    {
        this.team=team;
        roster = new HashMap<Integer,PlayerEntry>();
    }
    
    //Adds a new player by taking in their role and their location
    public void addPlayer(int number, Player player, TeamPositions teamPosition, Point2D.Double location)
    {
        if (!team.containsPlayer(player))
            throw new IllegalArgumentException(
                "Player " +player.getName() + " not found in team.");
        roster.put(number,(new PlayerEntry(number,player,teamPosition,location)));
    }
    
    //Takes a number and returns the player associated with it
    public Player getPlayer(int number)
    {
        return roster.get(number).player;
    }
    
    //Takes a number and returns the position associated with it
    public TeamPositions getTeamPosition(int number)
    {
        return roster.get(number).teamPosition;
    }
    
    //Takes a number and returns the location associated with it
    public Point2D.Double getLocation(int number)
    {
        return roster.get(number).location;
    }

    //Takes a number and removes the associated PlayerEntry from the hashmap.
    public PlayerEntry removePlayer(int number)
    {
        return roster.remove(number);
    }
    /*
    This subclass contains references to a player and an integer.
    
    Instance Data:
        player: The player who is being referenced
        teamPosition: The name of the position that they play on the field
        number: The number on the player's outfit
        location: The (x,y) coordinates of a player on the field, relative to
        the ball.
            NOTE: ASSUME THE OFFEENSE IS ALWAYS POSITIVE ON THE Y AXIS
    */
    private class PlayerEntry
    {
        private Player player;
        private int number;
        private TeamPositions teamPosition;
        private Point2D.Double location;
        
        public PlayerEntry(int number, Player player, TeamPositions teamPosition, Point2D.Double location)
        {
            if (location.x<-25.56 || location.x>26.65)
            {
                throw new IllegalArgumentException(
                "Player "+player.getName()+" has an invalid X position.");
            }
            
            this.player=player;
            this.teamPosition=teamPosition;
            this.location=location;
            this.number=number;
            
        }
    }
}
