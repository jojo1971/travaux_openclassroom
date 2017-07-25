package app_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws IOException {

		String mot;
		BufferedReader lettre = new BufferedReader(new InputStreamReader(System.in));
		
		mot = lettre.readLine();
		if(mot.equals("test"))
		System.out.println(mot);
		System.out.println("non");
		System.out.println("non2");
		
	}

}
