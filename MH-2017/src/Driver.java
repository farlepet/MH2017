import java.util.*;
public class Driver
{

	public static void main(String[] args)
	{

		Injury myInjury;

		myInjury = new Injury(31,12,2017, 2);

		Player myPlayer;

		myPlayer = new Player();

		myPlayer.setName("Mitchll");

		myPlayer.setHeight (213);

		myPlayer.addInjury(myInjury);

		System.out.println (myInjury.daysSinceInjury());

	}
}