import java.awt.geom.Point2D;
import java.util.*;
public class Driver
{

	public static void main(String[] args)
	{
		Team patriots;

		Team eagles;

		patriots = new Team("Patriots");

		eagles = new Team ("Eagles");

		Player mitchell;

		Player riley;

		Player tim;

		Player pete;

		mitchell = new Player();

		riley = new Player();

		tim = new Player();

		pete = new Player();

		Injury mInjury;

		Injury rInjury;

		Injury tInjury;

		Injury pInjury;

		mInjury = new Injury(21,1,2018, 0); // head injury

		rInjury = new Injury(2,1,2018, 1); // torso injury

		tInjury = new Injury(3,1,2018, 2); // arm injury

		pInjury = new Injury(4,1,2018, 3); // leg injury

		mitchell.addInjury(mInjury);

		riley.addInjury(rInjury);

		tim.addInjury(tInjury);

		pete.addInjury(pInjury);

		pete.setWeight(350);

		tim.setWeight(170);

		riley.setWeight(185);

		mitchell.setWeight(100);

		pete.setHeight(60);

		tim.setHeight(70);

		mitchell.setHeight(50);

		riley.setHeight(63);

		mitchell.setNumber(1);

		pete.setNumber(2);

		riley.setNumber(3);

		tim.setNumber(4);

		mitchell.setName("Mitchell");

		riley.setName ("Riley");

		pete.setName("Pete");

		tim.setName("Tim");

                eagles.addPlayer(mitchell);
                eagles.addPlayer(riley);
                eagles.addPlayer(tim);
                eagles.addPlayer(pete);

                patriots.addPlayer(mitchell);
                patriots.addPlayer(riley);
                patriots.addPlayer(tim);
                patriots.addPlayer(pete);

		Offense offense = new Offense(patriots);
                offense.addPlayer(pete, TeamPositions.OFFENSIVE_LINE, new Point2D.Double(0.0,3.0));
                offense.addPlayer(tim, TeamPositions.WIDE_RECIEVER, new Point2D.Double(0.0,0.0));
                offense.addPlayer(mitchell, TeamPositions.OFFENSIVE_LINE, new Point2D.Double(6.0,3.0));

        Defense defense = new Defense(eagles);
                defense.addPlayer(riley, TeamPositions.DEFENSIVE_LINE, new Point2D.Double(0.0,-3.0));
                defense.addPlayer(tim, TeamPositions.CORNERBACK, new Point2D.Double(0.0,-0.1));
                defense.addPlayer(mitchell, TeamPositions.DEFENSIVE_LINE, new Point2D.Double(6.0,-3.0));
                
                
                System.out.println(offense.getPlayer(tim.getNumber()));

            RiskFactor[] riskArray;

            riskArray = offense. getRiskLevels(defense);

            for (int i = 0; i<riskArray.length;i++)
            {
            	System.out.println("Name: " + riskArray[i].getPlayerEntry().getPlayer().getName() + " Risk Factor: " + riskArray[i].getRiskScore());

            }
            riskArray = defense. getRiskLevels(offense);

            for (int i = 0; i<riskArray.length;i++)
            {
            	System.out.println("Name: " + riskArray[i].getPlayerEntry().getPlayer().getName() + " Risk Factor: " + riskArray[i].getRiskScore());

            }

		//System.out.println(pete.riskAgainst(riley));
		//System.out.println(riley.riskFactorAgainst());

		//System.out.println(tim.riskFactorAgainst());

		//System.out.println(pete.riskFactor());





	}
}