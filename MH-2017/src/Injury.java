import java.util.*;
import java.util.concurrent.TimeUnit;

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
		date = Calendar.getInstance();
		date.set(Calendar.DAY_OF_MONTH,day);
		date.set(Calendar.MONTH,month);
		date.set(Calendar.YEAR,year);
		this.type = type;
		
	}

	public Calendar getDate()
	{
		return date;
	}

	public long daysSinceInjury()
	{

		long numDays;

		Calendar today;

		today = Calendar.getInstance();

		long dateOfInjury;

		dateOfInjury = this.date.getTimeInMillis();

		long now = today.getTimeInMillis();

		long diff = now - dateOfInjury;

		long diffDays = diff / (24 * 60 * 60 * 1000) + 30;

		numDays = TimeUnit.MILLISECONDS.toDays (Math.abs(dateOfInjury-now));

		return diffDays;
	}

	public int getType()
	{
		return type;
	}

}