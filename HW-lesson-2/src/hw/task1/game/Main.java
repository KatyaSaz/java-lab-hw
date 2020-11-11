package hw.task1.game;

public class Main {
	public static void main(String[] args) {
		//Initialisation
		Model model = new Model();
		View view  = new View();
		Controller controller  = new Controller(model, view);
		//start up
		controller.workMethod();
	}
}
