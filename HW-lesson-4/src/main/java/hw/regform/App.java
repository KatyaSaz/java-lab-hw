package hw.regform;

import hw.regform.controller.Controller;
import hw.regform.model.Model;
import hw.regform.view.View;

/**
 * Main class
 * @author Katya Sazonova
 *
 */
public class App {

	/**
	 * Program entry point
	 * @param args
	 */
	public static void main(String[] args) {
		// initialisation
		Controller controller = new Controller(new Model(), new View());
		//start up
		controller.workMethod();
	}
}
