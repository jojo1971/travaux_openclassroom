package garage_app;

public abstract class Moteur {

	protected double prix;
	protected String cylindre;
	protected TypeMoteur typeMoteur;
	public Moteur(){
		
	}
	
	public Moteur(String cylindre, double prix){
		this.cylindre = cylindre;
		this.prix = prix;
	}
	public double getPrix(){
		return prix;
	}
	public String toString(){
		return typeMoteur.toString();
	}
}
