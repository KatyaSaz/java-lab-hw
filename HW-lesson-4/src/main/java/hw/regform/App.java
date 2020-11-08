package hw.regform;

import hw.regform.controller.Controller;
import hw.regform.model.Model;
import hw.regform.view.View;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		View view = new View();
		Controller controller = new Controller(new Model(), view);
		controller.workMethod();
	}
}
