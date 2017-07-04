package garage_app;

public class VitreElectrique implements Option_{
	private double prix;
	private String name = "VitreElectrique";

	public double getPrix(){
		prix = 212.35;
		return prix;
	}
	public String getName(){
		return name;
	}

}
