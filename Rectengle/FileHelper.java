package Rectengle;

import java.io.IOException;

public  class FileHelper {
	//public static void main(String[] args) throws IOException{

		
	public static void read(String[] read) throws IOException{
//String[] read = FileOpr.readFile("C:/Users/Asus/Desktop/hede/readme.md").split(","); 

int width=Integer.parseInt(read[0]);;
int height=Integer.parseInt(read[1]);;
char karakter=read[2].charAt(0);

Shape s= new Shape(width,height,karakter);
System.out.println(s.getShape(width, height, karakter));


}
	}
	
	
			
		
	
	
	

