package tr.org.lyk16082016;

 
 
 import java.io.IOException; 
 import java.nio.charset.Charset; 
 import java.nio.file.FileAlreadyExistsException; 
 import java.nio.file.FileSystems; 
 import java.nio.file.Files; 
import java.nio.file.Path; 
 import java.nio.file.Paths; 
 import java.util.List; 
 
 
 public class FileOperations { 
 
 
 	public static void createDirectory(String dir) throws IOException { 
 		try { 
 			Files.createDirectories(Paths.get(dir)); 
 			System.out.println(dir + " oluþturuldu."); 
 		} catch (FileAlreadyExistsException e) { 
 			System.out.println("Dizin zaten var."); 
 		} 
 
 	} 
 
 
 	public static void createFile(String pathAndFile) throws IOException { 
 
 
 	 try { 
 			Path FilePath = Paths.get(pathAndFile); 
 			Files.createFile(FilePath); 
 			System.out.println(pathAndFile + " oluþturuldu."); 
 	} catch (FileAlreadyExistsException e) { 
 		System.out.println("Dosya zaten var."); 
 		} 
           
 
 	} 
 
 
 	public static void writeToFile(String hede, String pathAndFile) throws IOException { 
 
 
 		Files.write(Paths.get(pathAndFile), hede.getBytes()); 
 		 System.out.println(hede + ", " + pathAndFile + " dizinine yazdýrýldý."); 
 
 
 	} 
 
 
 	public static void readFile(String pathAndFile) throws IOException { 
 
 
 		List<String> lines = Files.readAllLines(Paths.get(pathAndFile)); 
 
 
 		for (String line : lines) { 
 
 
 			System.out.println("Okunan hede: " + line); 
 
 
 		} 
 	} 
 
 
 } 
