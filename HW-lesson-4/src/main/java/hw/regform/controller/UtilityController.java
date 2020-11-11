package hw.regform.controller;

import java.util.Scanner;
import hw.regform.view.View;

/**
 * Additional class, that realized work with console
 * @author Katya Sazonova
 */
public class UtilityController {

	private Scanner scanner;
	private View view;

	/**
	 * Constructor of class (with parameters)
	 * @param scanner - object, helps reading data from console
	 * @param view - object that help to output data on screen
	 */
	public UtilityController(Scanner scanner, View view) {
		super();
		this.scanner = scanner;
		this.view = view;
	}

	/**
	 * Method, that require user input information, read string from console, 
	 * check is it appropriate for current condition (regexp), if it right - 
	 * return inputed information, if not - ask to enter data again 
	 * current regexp  
	 * @param message - name of variable from resource where request is situated
	 * @param regexp - constant structure for checking correctness of input line
	 * @return input data as string (if it passed checks)
	 */
	public String inputStringWithScanner(String message, String regexp) {
		view.printInputStringBundle(message);
		String str = "";
		while (!(scanner.hasNext() && (str = scanner.next()).matches(regexp))) {
			view.printWrongInputStringBundle(message);
		}
		return str;
	}

}
