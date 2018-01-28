import java.util.*;
public class Player
{

	 public String name;

	 public int number;

	 public int age;

	 public int height;

	 public int weight;

	 public ArrayList<Injury> injuryHistory;

	 public Injury currentInjury;

	 public Player ()
	 {
	 	injuryHistory = new ArrayList<Injury>();
	 }

	 public void addInjury(Injury injury)
	 {
	 	injuryHistory.add (injury);
	 }

	 public double riskAgainst(Player opponent)
	 {
	 	double riskFactor = 0;

	 	for (int i =0; i <injuryHistory.size();i++)
	 	{
	 		currentInjury = injuryHistory.get(i);

	 		riskFactor += injuryFormula(currentInjury);
	 	}



	 	if( riskFactor > 100)
	 	{
	 		riskFactor = 100;
	 	}



	 	return riskFactor;
	 }

	 private double weightFormula (  )

	 private double injuryFormula(Injury injury)
	 {
	 	double retVal;

	 	int type;

	 	int a,b;

	 	type = injury.getType();

	 	/*
			Head injuries put Players at much greater risk of a further head injury, 
			no matter the revoery time. A leg injury takes longer to recover than most. 
	 	*/

	 	if ( type == 0 )//if injury is head injury
	 	{
	 		a = 200;

	 		b=15; // Head injuries will never bring risk to 0
	 	}

	 	else if ( type == 3)//if injury is leg injury 
	 	{

	 		a = 500;

	 		b = 0; // Leg injuries 

	 	}

	 	else // all other types of injuries
	 	{
	 		a = 100;

	 		b = 0;
	 	}
	 	System.out.println("a = " + a + "  b = " + b);
	 	retVal = ((double)a/(double)injury.daysSinceInjury())+(double)b;

	 	return retVal;
	 }

	 public void setName(String name) {this.name = name;}

	 public void setNumber(int number){this.number = number;}

	 public void setAge(int age) {this.age = number;}

	 public void setHeight(int height) {this.height= height;}

	 public void setWeight(int weight) {this.weight= weight;}

	 public String getName() {return this.name;}

	 public int getNumber() {return this.number;}

	 public int getAge() {return this.age;}

	 public int getHeight() {return this.height;}

	 public int getWeight() {return this.weight;}

}