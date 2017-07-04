package garage_app;

public class MoteurElectrique extends Moteur{

	public MoteurElectrique(){
		super.typeMoteur = typeMoteur.ELECTRIQUE;
	}
	public MoteurElectrique(String cylindre, double prix){
		super.cylindre = cylindre;
		super.prix = prix;
		super.typeMoteur = typeMoteur.ELECTRIQUE;
		
	}

}
