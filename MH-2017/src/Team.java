/*
    This abstract class contains a list of players and their positions.

    Instance Data:
        roster: An arraylist which contains a list of all the players on a team
        along with their position.
 */

import java.util.ArrayList;

public abstract class Team
{
    private ArrayList<PlayerEntry> roster;
    
    /*
    This subclass contains references to a player and an integer.
    */
    private class PlayerEntry
    {
        private Player player;
        private TeamPositions position;
    }
}
