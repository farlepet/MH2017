/*
This class contains references to a player and an integer.

Instance Data:
    player: The player who is being referenced
    teamPosition: The name of the position that they play on the field
    number: The number on the player's outfit
    location: The (x,y) coordinates of a player on the field, relative to
    the ball.
        NOTE: ASSUME THE OFFEENSE IS ALWAYS POSITIVE ON THE Y AXIS
*/
import java.awt.geom.Point2D;

public class PlayerEntry
{
    private Player player;
    private int number;
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
        this.number=player.getNumber();

    }

    public Player getPlayer(){return player;}
    public TeamPositions getTeamPositions(){return teamPosition;}
    public Point2D.Double getLocation(){return location;}
    public int getNumber(){return number;}
}