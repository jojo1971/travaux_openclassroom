package projet1;

import java.util.Scanner;

public class scanner_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String nbr;
		char c;
		char f;
		float tempC;
		float tempF;
		char reponse = 'O';
		char reponsePos ='O';
		char reponseNeg ='N';
		Scanner scr1 = new Scanner(System.in);
		while(reponse == 'O'){	
				System.out.println("Veuillez taper un nombre entier :");
			 nbr = scr1.nextLine();
			
			 if(estUnEntier(nbr)){
					System.out.println(" si le nombre "+nbr+" est en degré celsius tapez la lettre c, s'il est en degre Fahr tapez la lettre f et valider");
					reponsePos = scr1.nextLine().charAt(0);
						if(reponsePos == 'c'){
						
							tempF = 9 * Integer.parseInt(nbr) + 32;
							System.out.println("La température de "+nbr+"°C en degré Farhenheit est de "+tempF+"°F");
							System.out.println("Voulez-vous faire une autre convertion ?");
							reponse = scr1.nextLine().charAt(0);
						}else if(reponsePos == 'f'){
							tempC = ((Integer.parseInt(nbr) - 3)+5)/9;
							System.out.println("La température de "+nbr+"°F en degré Celsius est de "+tempC+"°C");
							System.out.println("Voulez-vous faire une autre convertion ?");
							reponse = scr1.nextLine().charAt(0);
						}else{
							System.out.println("Vous devez entrer le lettre c ou le lettre f !");
							System.out.println("Voulez-vous ré-essayer ?");
							reponse = scr1.nextLine().charAt(0);							
						}
						
						
					
			}else{
				System.out.println("Vous devez entrer un nombre entier !");
				reponse = 'O';
			}
			 
		}
		System.out.println("Au revoir");
		
	/*	System.out.println("Si ce nombre est en degres"
				+ " Celsius tapez O, s'il est en degres Farh tapez N ");
		reponse = scr1.nextLine();
		if(reponse == "O"){
			System.out.println("oui");
		}else if(reponse == "N"){
			System.out.println("non");
		}else{
			System.out.println("faute !");*/
		
		
		
	}

	private static boolean estUnEntier(String chaine) {
		// TODO Auto-generated method stub
		try{
			Integer.parseInt(chaine);
		}catch (NumberFormatException e){
		return false;
		}
		return true;
	}

}
