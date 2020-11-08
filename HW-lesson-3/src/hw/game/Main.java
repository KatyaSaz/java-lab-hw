package hw.game;

public class Main {
	public static void main(String[] args) {
		//initialization
		Controller controller  = new Controller(new Model(), new View());
		//start up
		controller.workMethod();
	}
}
