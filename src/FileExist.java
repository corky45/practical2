import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner; 

public class FileExist {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:\\Users\\clcra\\OneDrive\\Documents\\Words.txt");
		Scanner scanner = new Scanner(path);
		System.out.println("Read text file using Scanner");
		
		while(scanner.hasNextLine()){
		    String line = scanner.nextLine();
		    String[] words = line.split("");
		    
		    System.out.println(line);
		}
		scanner.close();
	
	
	}

}
