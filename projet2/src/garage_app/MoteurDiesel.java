package garage_app;

public class MoteurDiesel extends Moteur{

	public MoteurDiesel(){
		super.typeMoteur = typeMoteur.DIESEL;
	}
	public MoteurDiesel(String cylindre, double prix){
		super.cylindre = cylindre;
		super.prix = prix;
		super.typeMoteur = typeMoteur.DIESEL;
		
	}

}
