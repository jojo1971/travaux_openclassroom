package projet1;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.print("hello world");
		System.out.println("\nhellooo world");
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot : ");
		String str = sc.nextLine();
		System.out.println("Vous avez saisi : "+ str);
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre : ");
		int nbr = sc2.nextInt();
		System.out.println("Vous avez saisi le nombre : "+ nbr);*/
		

		String prenom;
		char reponse = 'O';
		Scanner sc1 = new Scanner(System.in);
		while(reponse == 'O'){
			System.out.println("Entrer votre prenom : ");
			prenom = sc1.nextLine();
			System.out.println("Bonjour "+prenom+" comment allez -vous ?");
			System.out.println("Voulez-vous continuer ?");
			reponse = sc1.nextLine().charAt(0);
			
		
		}
		System.out.println("Au revoir...");
		
	}

}
