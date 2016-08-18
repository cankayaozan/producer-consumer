import java.util.ArrayList;
import java.util.List;

public class Application {
	static List<Data> container = new ArrayList<>();

	public static void addToList(Data data) {
		synchronized (container) {
			container.add(data);
		}
		//System.out.println(container.size());
		

	}

	public static Data  getData(){
		synchronized (container) {
		if(!container.isEmpty()){
			return container.remove(0);
		}
		}
		return null;
	}
	
	public static void main(String args[]) {

		Thread p1 = new Thread(new Produce());
		Thread p2 = new Thread(new Produce());
		Thread p3 = new Thread(new Produce());
		Thread p4 = new Thread(new Produce());

		
		

		p1.start();
        p2.start();
        p3.start();
        p4.start();
        		
        Thread c1 = new Thread(new Consumer());
		Thread c2 = new Thread(new Consumer());
		Thread c3 = new Thread(new Consumer());
		Thread c4 = new Thread(new Consumer());

		
		

		c1.start();
        c2.start();
        c3.start();
        c4.start();
        		
		

	}

}
