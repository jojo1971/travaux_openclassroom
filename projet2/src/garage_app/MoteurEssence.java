package garage_app;

public class MoteurEssence extends Moteur{

	public MoteurEssence(){
		super.typeMoteur = typeMoteur.ESSENCE;
	}
	public MoteurEssence(String cylindre, double prix){
		super.cylindre = cylindre;
		super.prix = prix;
		super.typeMoteur = typeMoteur.ESSENCE;
		
	}

}
