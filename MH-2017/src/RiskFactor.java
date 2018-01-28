/*
    Contains a player entry and an associated risk factor
 */
public class RiskFactor
{
    private double riskScore;
    private PlayerEntry playerEntry;
    public RiskFactor(double riskScore, PlayerEntry playerEntry)
    {
        this.riskScore = riskScore;
        this.playerEntry = playerEntry;
    }
    
    public PlayerEntry getPlayerEntry() {return playerEntry;}
    public double getRiskScore() {return riskScore;}
}
