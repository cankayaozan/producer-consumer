package tr.org.lyk16082016;

 
 
 import java.io.IOException; 
 import java.nio.ByteBuffer; 
 
 
 public class FileOperationTest { 
 
 
 	public static void main(String args[]) throws IOException { 
 
 
 		FileOperations.createDirectory("C:/Users/Asus/Desktop/hede"); 

 
 		FileOperations.createFile("C:/Users/Asus/Desktop/hede/readme.md"); 
 
 
		FileOperations.writeToFile("ASDFG","C:/Users/Asus/Desktop/hede/readme.md"); 

 
 		FileOperations.readFile("C:/Users/Asus/Desktop/hede/readme.md"); 

 
}
 }