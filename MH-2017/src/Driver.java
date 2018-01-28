import java.util.*;
public class Driver
{

	public static void main(String[] args)
	{
		Team myTeam;

		myTeam= new Team("Jarvis Knights");

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

		mInjury = new Injury(2,1,2018, 0); // head injury

		rInjury = new Injury(2,1,2018, 1); // torso injury

		tInjury = new Injury(3,1,2018, 2); // arm injury

		pInjury = new Injury(4,1,2018, 3); // leg injury

		mitchell.addInjury(mInjury);

		riley.addInjury(rInjury);

		tim.addInjury(tInjury);

		pete.addInjury(pInjury);

		

		System.out.println(tim.riskAgainst(riley));
		//System.out.println(riley.riskFactorAgainst());

		//System.out.println(tim.riskFactorAgainst());

		//System.out.println(pete.riskFactor());





	}
}