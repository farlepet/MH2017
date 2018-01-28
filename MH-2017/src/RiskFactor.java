/*
    Contains a player entry and an associated risk factor
 */
public class RiskFactor
{
    private int riskScore;
    private PlayerEntry playerEntry;
    public RiskFactor(int riskScore, PlayerEntry playerEntry)
    {
        this.riskScore = riskScore;
        this.playerEntry = playerEntry;
    }
    
    public PlayerEntry getPlayerEntry() {return playerEntry;}
    public int getRiskScore() {return riskScore;}
}
