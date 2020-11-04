package hw.hello;

import java.util.Scanner;

public class Controller {

	public static final String HELLO = "Hello";
	public static final String WORLD = "world";

	private Model model;
	private View view;

	// constructor
	public Controller(Model model, View view) {
		super();
		this.model = model;
		this.view = view;
	}

	// work method call from main
	public void workMethod() {
		Scanner sc = new Scanner(System.in);

		model.setFirstWord(inputWordWithScanner(sc, view.INPUT_FIRST_WORD, HELLO));
		model.setSecondWord(inputWordWithScanner(sc, view.INPUT_SECOND_WORD, WORLD));
		view.printResult(view.OUTPUT_RESULT, model.concatenateWordsInSentance());
	}

	// check is word appropriate
	public String inputWordWithScanner(Scanner sc, String kindOfWord, String requiredWord) {
		String input = "";
		view.printMessage(kindOfWord);
		
		if (sc.hasNext()) {
			input = sc.nextLine();
		}

		while (!input.equals(requiredWord)) {
			view.printMessage(view.WRONR_INPUT_WORD);
			input = sc.nextLine();
		}
		return input;
	}

}
