import java.util.*;
public class Player
{

	 public String name;

	 public int number;

	 public int age;

	 public int height;

	 public ArrayList<Injury> injuryHistory;

	 public Player ()
	 {
	 	injuryHistory = new ArrayList<Injury>();
	 }

	 public void addInjury(Injury injury)
	 {
	 	injuryHistory.add (injury);
	 }

	 public String setName() {return this.name;}

	 public int setNumber(){return this.number;}

	 public int setAge() {return this.age;}

	 public int setHeight() {return this.height;}

	 public String getName() {return this.name;}

	 public int getNumber() {return this.number;}

	 public int getAge() {return this.age;}

	 public int getHeight() {return this.height;}

}