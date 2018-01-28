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

	 public void setName(String name) {this.name = name;}

	 public void setNumber(int number){this.number = number;}

	 public void setAge(int age) {this.age = number;}

	 public void setHeight(int height) {this.height= height;}

	 public String getName() {return this.name;}

	 public int getNumber() {return this.number;}

	 public int getAge() {return this.age;}

	 public int getHeight() {return this.height;}

}