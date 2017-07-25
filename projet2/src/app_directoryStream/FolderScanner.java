package app_directoryStream;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FolderScanner {
	private Path path = null;
	private String filter = "*";
	private long result = 0;

	public FolderScanner(){}
	public FolderScanner(Path p, String f)
	{
		this.path = p;
		this.filter = f;
	}
	
	public long sequentialScan() throws ScanException
	{
		if (path == null || path.equals("")) {
			throw new ScanException("Le chemin n'est pas vailide ou nul");
		}
		System.out.println("Scan du dossier "+path+" à la recherche des fichiers avec l'extension : "+this.filter);
		try(DirectoryStream<Path> listing = Files.newDirectoryStream(path)) {
			for(Path nom : listing)
			{
				if (Files.isDirectory(nom.toAbsolutePath())) {
					FolderScanner f = new FolderScanner(nom.toAbsolutePath(),filter);
					result += f.sequentialScan();
				}
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		try(DirectoryStream<Path> listing = Files.newDirectoryStream(path)) {
			for(Path nom : listing)
			{
				result++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
		
	}
}
