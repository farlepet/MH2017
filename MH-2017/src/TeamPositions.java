/*
    A list of positions which a player might play.
 */
public enum TeamPositions
{
    //DEFENSE
    CORNERBACK(false,null),
    LINEBACKER(false,null),
    DEFENSIVE_LINE(false,null),
    SAFETY(false,null),
    
    //OFFENSE
    OFFENSIVE_LINE(true, new TeamPositions[] {DEFENSIVE_LINE}),
    QUARTERBACK(true, new TeamPositions[] {DEFENSIVE_LINE,LINEBACKER}),
    RUNNINGBACK(true, new TeamPositions[] {LINEBACKER}),
    WIDE_RECIEVER(true, new TeamPositions[] {CORNERBACK,SAFETY}),
    TIGHT_END(true, new TeamPositions[] {LINEBACKER});
    
    private final boolean offense;
    private final TeamPositions[] riskPositions;
    
    TeamPositions(boolean offense, TeamPositions[] riskPositions)
    {
        this.offense=offense;
        this.riskPositions=riskPositions;
    }
    
    public boolean getOffense()
    {
        return offense;
    }
    
    public TeamPositions[] getRiskPositions()
    {
        return riskPositions;
    }
    
}

