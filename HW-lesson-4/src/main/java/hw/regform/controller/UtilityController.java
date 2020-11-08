package hw.regform.controller;

import java.util.Scanner;

import hw.regform.view.View;

public class UtilityController {

	private Scanner scanner;
	private View view;

	public UtilityController(Scanner scanner, View view) {
		super();
		this.scanner = scanner;
		this.view = view;
	}

	public String inputStringWithScanner(String message, String regexp) {
		view.printInputStringBundle(message);
		String str = "";
		while (!(scanner.hasNext() && (str = scanner.next()).matches(regexp))) {
			view.printWrongInputStringBundle(message);
		}
		return str;
	}

}
