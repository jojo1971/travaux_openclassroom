package garage_app;

public class MoteurHybride extends Moteur{

	public MoteurHybride(){
		super.typeMoteur = typeMoteur.HYBRIDE;
	}
	
	public MoteurHybride(String cylindre, double prix){
		super.cylindre = cylindre;
		super.prix = prix;
		super.typeMoteur = typeMoteur.HYBRIDE;
		
	}

}
