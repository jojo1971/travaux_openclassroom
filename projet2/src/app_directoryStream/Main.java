package app_directoryStream;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {

		Path chemin = Paths.get("D:\\Mes documents\\informatique\\travail");
		String filtre = ".txt";
		FolderScanner folderScanner = new FolderScanner(chemin,filtre);
	
		try {
			long start = System.currentTimeMillis();
			long resultat = folderScanner.sequentialScan();
			long end= System.currentTimeMillis();
			System.out.println("ce répertoire contient "+resultat+" pour l'extension "+filtre);
			System.out.println("temps d'execution = "+(end-start));
		} catch (ScanException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
