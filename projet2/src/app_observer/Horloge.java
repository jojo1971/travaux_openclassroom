package app_observer;


import java.util.ArrayList;
import java.util.Calendar;

public class Horloge implements Observable{

	private String hour= "";
	private ArrayList<Observateur> listObservateur = new ArrayList<Observateur>();
	private Calendar cal;

	public void run()
	{
		while(true)
		{
			cal = Calendar.getInstance();
			this.hour = 
					this.cal.get(Calendar.HOUR_OF_DAY) < 10 ? "0"+this.cal.get(Calendar.HOUR_OF_DAY)  : this.cal.get(Calendar.HOUR_OF_DAY)+":"+
							(this.cal.get(Calendar.MINUTE) < 10 ? "0"+this.cal.get(Calendar.MINUTE)  : this.cal.get(Calendar.MINUTE))+":"+
									(this.cal.get(Calendar.SECOND) < 10 ? "0"+this.cal.get(Calendar.SECOND)  : this.cal.get(Calendar.SECOND)) ;

									this.updateObservateur();

									try {
										Thread.sleep(1000);
									} catch (InterruptedException e) {
										e.printStackTrace();
									}
		}
	}
	@Override
	public void addObservateur(Observateur obs) {
		this.listObservateur.add(obs);		
	}

	@Override
	public void updateObservateur() {
		for(Observateur obs : listObservateur)obs.update(this.hour);		


}
}