import java.util.*;
public class Driver
{

	public static void main(String[] args)
	{

		Injury myInjury;

		myInjury = new Injury(2,1,2018, 2);

		Player myPlayer;

		myPlayer = new Player();

		myPlayer.setName("Mitchll");

		myPlayer.setHeight (213);

		myPlayer.addInjury(myInjury);

	}
}