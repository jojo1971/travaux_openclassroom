package garage_app;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public abstract class Vehicule  {

	protected Moteur moteur;
	protected Marque marque;
	protected TypeMoteur typeMoteur;
	private double prix;
	private double prixTotal;
	
	public String nom;
	private List<Option_> opt = new ArrayList<Option_>();
	
	
	public void setMoteur(Moteur moteur){
		this.moteur = moteur;
	}
	
	
	public  void addOption(Option_ option_){
		opt.add(option_);
	}
	public Marque getMarque(){
		return marque;
	}
	public String getOption(){
		DecimalFormat df = new DecimalFormat("#.##");
	int compt = 1;
	prixTotal = 0;
	System.out.print("Voiture "+marque+" : "+nom+" "+typeMoteur+" "+moteur.cylindre+" ("+moteur.getPrix()+") ");
	System.out.print(" [");
	for (Option_ option_ : opt) {
		if (compt != opt.size()) {
			prixTotal = prixTotal + option_.getPrix();
			System.out.print(option_.getName()+" ("+option_.getPrix()+"), ");
			compt++;
		} else {
			prixTotal = prixTotal + option_.getPrix();
			System.out.print(option_.getName()+" ("+option_.getPrix()+")");
		}
		
	}
	System.out.print("] ");
	prixTotal = prixTotal + moteur.prix;
	System.out.println(" d'une valeur totale de "+df.format(prixTotal)+"€");
	return"";

	}
	public String toString(){

		return this.getOption();
	}
	public double getPrix(){
		return prix;
	}
}
