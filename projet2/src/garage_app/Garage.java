package garage_app;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
		List<Vehicule> vehicules = new ArrayList<Vehicule>();
		
	public Garage()
	{
		System.out.println("*************************");
		System.out.println("*      GARAGE A GG      *");
		System.out.println("*************************");
	}
		
	
		
		public void addVehicule(Vehicule vehicule)
		{
			vehicules.add(vehicule);
			vehicule.toString();
			
		}
}
