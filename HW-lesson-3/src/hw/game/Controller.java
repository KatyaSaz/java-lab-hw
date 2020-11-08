package hw.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

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
		model.setInitialBorders(GlobalConstants.START_MIN_BORDER, GlobalConstants.START_MAX_BORDER);
		model.setRandValue(
				model.generateRandomValue(
						GlobalConstants.START_MIN_BORDER, GlobalConstants.START_MAX_BORDER));
		
		Scanner sc = new Scanner(System.in);
		view.printMessage(view.START_WORDS);

		while (true) {
			int inputValue = inputNumberWithScanner(sc);
			if (model.compareNumbers(inputValue)) {
				break;
			} else {
				view.printMessage(view.OUTPUT_DONT_GUESS + model.biggerOrLower(inputValue));
			}
		}
		
		view.printMessageWithNumber(view.OUTPUT_RESULT_NUMBER, model.getRandValue());
		view.printMessageWithNumber(view.OUTPUT_ATTEMPTS_AMOUNT, model.getAttempts().size());
		view.printMessage(view.OUTPUT_ATTEMPTS + view.prepareAttemptsToPrint(model.getAttempts()));
		
	}

	// check is number appropriate: is it a number in the range [from, to]
	public int inputNumberWithScanner(Scanner sc) {
		int number = 0;
		view.printDiap(model.getMinBorder(), model.getMaxBorder());

		while (true) {
			boolean isError = false;
			if (sc.hasNextInt()) {
				number = sc.nextInt();
				if (!model.isNumberInDiaposone(number)) {
					isError = true;
				}
			} else {
				isError = true;
				sc.next();
			}
			if (isError) {
				view.printMessage(view.WRONG_INPUT_NUMBER);
				view.printDiap(model.getMinBorder(), model.getMaxBorder());
			} else {
				break;
			}
		}
		
		return number;
	}

}
