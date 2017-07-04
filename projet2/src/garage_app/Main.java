package garage_app;

public class Main {

	public static void main(String[] args) {
		Garage garage = new Garage();
		//System.out.println(garage);		

		Vehicule lag1 = new Laguna();
		lag1.setMoteur(new MoteurHybride("150 Chevaux",10256d));
		lag1.addOption(new GPS());
		lag1.addOption(new SiegeChauffant());
		lag1.addOption(new VitreElectrique());
		garage.addVehicule(lag1);

		Vehicule A300B_2 = new A300B();
		A300B_2.setMoteur(new MoteurElectrique("1500 W", 1234d));
		A300B_2.addOption(new Climatisation());
		A300B_2.addOption(new Barres_de_toit());
		A300B_2.addOption(new SiegeChauffant());
		garage.addVehicule(A300B_2);


		Vehicule d4_1 = new D4();
		d4_1.setMoteur(new MoteurDiesel("200 Hdi", 25684.80d));
		d4_1.addOption(new Barres_de_toit());
		d4_1.addOption(new Climatisation());
		d4_1.addOption(new GPS());
		garage.addVehicule(d4_1);   	

		Vehicule lag2 = new Laguna();
		lag2.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
		garage.addVehicule(lag2);

		Vehicule A300B_1 = new A300B();
		A300B_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
		A300B_1.addOption(new VitreElectrique());
		A300B_1.addOption(new Barres_de_toit());
		garage.addVehicule(A300B_1);

		Vehicule d4_2 = new D4();
		d4_2.setMoteur(new MoteurElectrique("100 KW", 1224d));
		d4_2.addOption(new SiegeChauffant());
		d4_2.addOption(new Barres_de_toit());
		d4_2.addOption(new Climatisation());
		d4_2.addOption(new GPS());
		d4_2.addOption(new VitreElectrique());
		garage.addVehicule(d4_2);   			

	}
}
