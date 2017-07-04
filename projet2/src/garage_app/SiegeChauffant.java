package garage_app;

public class SiegeChauffant implements Option_{
	private double prix;
	private String name = "SiegeChauffant";

	public double getPrix(){
		prix = 562.9;
		//name = "SiegeChauffant";
		return prix;
	}
	public String getName(){
		return name;
	}

}
