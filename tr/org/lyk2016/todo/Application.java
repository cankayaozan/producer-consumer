package tr.org.lyk2016.todo;

import java.util.Scanner;
import java.lang.*;

public class Application {

	public static void main(String[] args) {
		String input = "";
		Scanner scanner = new Scanner(System.in);

		while (true) {
			Menu.printMenu();
			input = scanner.nextLine();

			processInput(input);
		}

	}

	private static void processInput(String input) {
		String trimped = input.trim(); 

		String[] inputParams = input.split(",");

		int action;
		if(trimped.length()==input.length()){
		try {
			action = Integer.parseInt(inputParams[0]);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("bir de�er girin, bos bos enter a basmay�n");
			return;
}
		String param = null;
		if (inputParams.length > 1) {
			param = inputParams[1];
		}

		System.out.println("[debug] action: " + action);
		System.out.println("[debug] param: " + param);

		int index;
		switch (action) {
		case 0:
			System.out.println("Exiting...");
			System.exit(0);
		case 1:
			Todo newTodo = new Todo(param);
			TodoHelper.add(newTodo);
			break;
		case 2:
			try {
				index = Integer.parseInt(param);
				TodoHelper.mark(index - 1, true);
			} catch (MyException e) {
				// TODO Auto-generated catch block
System.out.println("giris sekliniz yanl�s"+e.getMassage);
return;
		}
			break;
		case 3:
			// TODO use TodoHelper's remove method here
			// hint: it's already implemented, you need to just call it (use it)
			// here
			index = Integer.parseInt(param);
			TodoHelper.remove(index - 1);

			break;

		default:
			break;
		}

	}
		else 
			System.out.println("bosluk i�eren ifade var ");
}
}