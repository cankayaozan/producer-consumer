
public class Produce implements Runnable {
	
	
	public void run(){
		while(true){
			Data data= new Data(System.nanoTime());
			Application.addToList(data);
			
			try{
				Thread.sleep(50);
			}
			catch (InterruptedException e){
				System.out.println("hata");
			}
		}
	}
	
}
