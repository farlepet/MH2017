import java.util.*;

/*
	This class represents injuries that players have. 

	0= head injury 
	1= torso
	2= arm / shoulder
	3= leg / feet / ankles / knees

*/
public class Injury
{

	private Calendar date;
	private int type;
	

	public Injury(int day, int month, int year, int type)
	{
		date.set(Calendar.DAY_OF_MONTH,day);
		date.set(Calendar.MONTH,month);
		date.set(Calendar.YEAR,year);
		this.type = type;
		
	}

	public Calendar getDate()
	{
		return date;
	}

	public int getType()
	{
		return type;
	}

}