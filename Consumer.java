import java.io.FileWriter;
import java.io.IOException;

public class Consumer extends Thread{

//	Data data;
//	long time;
	 public Consumer(){
	 }
	 
	 @Override
	public void run() {
		while(true){
			Data data=Application.getData();
			if(data!=null){
				System.out.println(data.time);
try {
	FileWriter fw=new FileWriter ("C:/Users/Asus/Desktop/hede/readme.md",true);
	fw.write(data.toString());
	fw.write("\n");
	fw.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}			}
			try{
				Thread.sleep(50);
			}
			catch (InterruptedException e){
				System.out.println("hata");
		}
	}
	 }
	
}
