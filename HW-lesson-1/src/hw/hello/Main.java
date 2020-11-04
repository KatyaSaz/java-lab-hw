package hw.hello;

public class Main {
	public static void main(String[] args) {
		//initialization
		Model model = new Model();
		View view  = new View();
		Controller controller  = new Controller(model, view);
		//start up
		controller.workMethod();
	}
}
