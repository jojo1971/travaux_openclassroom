package garage_app;

public class Climatisation implements Option_{
	private double prix;
	private String name = "Climatiseur";


	public double getPrix(){
		prix = 784;
		return prix;
	}
	public String getName(){
		return name;
	}

}
