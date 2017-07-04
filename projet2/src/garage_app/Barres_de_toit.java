package garage_app;

public class Barres_de_toit implements Option_{
	private double prix;
	private String name = "Barres de toit";


	public double getPrix(){
		prix = 458;
		return prix;
	}
	public String getName(){
		return name;
	}

}
