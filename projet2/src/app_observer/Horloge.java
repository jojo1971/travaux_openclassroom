package app_observer;

import java.util.Calendar;

public class Horloge {

	private Calendar cal;
	private String hour = "";
	public Horloge()
	{

		cal = Calendar.getInstance();
		hour = "heure "+ this.cal.get(Calendar.HOUR_OF_DAY);
		
		//System.out.println("cal");
		
	}
	public String getHour()
	{
		return hour;
	}

}
