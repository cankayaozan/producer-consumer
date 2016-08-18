
package Rectengle;

import java.io.IOException;

import tr.org.lyk16082016.FileOperations;

public class Application {

	
	public static void main(String args[])  throws IOException { 
		 
		 
// 		FileOpr.createDirectory("C:/Users/Asus/Desktop/hede"); 
//
// 
// 		FileOpr.createFile("C:/Users/Asus/Desktop/hede/readme.md"); 
 		FileOpr.writeToFile("7,15"
 				+ ",#","C:/Users/Asus/Desktop/hede/readme.md"); 
 		String[] read = FileOpr.readFile("C:/Users/Asus/Desktop/hede/readme.md").split(","); 

FileHelper.read(read);
 

 
}
 }

