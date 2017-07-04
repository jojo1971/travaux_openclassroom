package garage_app;

public class GPS implements Option_{
	private double prix;
	private String name = "GPS";

	public double getPrix(){
		prix = 113.5;
		name = "GPS";
		//System.out.println(name+" ("+prix+")");
		return prix;
	}
	public String getName(){
		return name;
	}

}
