package hw.task1.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {

	public static final int MIN = 0;
	public static final int MAX = 100;
	public static final String BIGGER = "bigger";
	public static final String LOWER = "lower";

	private Model model;
	private View view;
	private int rand;
	private List<Integer> attempts;

	// constructor
	public Controller(Model model, View view) {
		super();
		this.model = model;
		this.view = view;
		attempts = new ArrayList<>();
	}
	
	//generate random value in range [start, end]
	public int randomGenerate(int start, int end) {
		return (int) (Math.random() * (end - start + 1) + start);
	}

	//chooses what word must be added to output
	public String isInputNumberBiggerOrLower() {
		return (model.compareNumbers(rand)) ? BIGGER : LOWER;
	}

	//prepare elements of ArrayList for output
	public void printAttempts(List<Integer> attempts) {
		view.printMessageWithNumber(view.OUTPUT_ATTEMPTS_AMOUNT, attempts.size());
		String str = "";
		for (Integer attempt : attempts) {
			str += attempt + " ";
		}
		view.printMessage(view.OUTPUT_ATTEMPTS + str);
	}

	// work method call from main
	public void workMethod() {
		rand = randomGenerate(MIN, MAX);

		Scanner sc = new Scanner(System.in);
		view.printMessage(view.START_WORDS);

		while (true) {
			model.setValue(inputNumberWithScanner(sc, MIN, MAX));
			attempts.add(model.getValue());
			if (model.isEqual(rand)) {
				break;
			} else {
				view.printMessage(view.OUTPUT_DONT_GUESS + isInputNumberBiggerOrLower());
			}
		}
		
		view.printMessageWithNumber(view.OUTPUT_RESULT_NUMBER, model.getValue());
		printAttempts(attempts);
		
	}

	// check is number appropriate: is it a number in the range [from, to]
	public int inputNumberWithScanner(Scanner sc, int from, int to) {
		int number = 0;
		view.printMessage(view.INPUT_INT_NUMBER);

		while (true) {
			boolean isError = false;
			if (sc.hasNextInt()) {
				number = sc.nextInt();
				if ((number > to) || (number < from)) {
					isError = true;
				}
			} else {
				isError = true;
				sc.next();
			}
			if (isError) {
				view.printMessage(view.WRONG_INPUT_NUMBER + view.INPUT_INT_NUMBER);
			} else {
				break;
			}
		}
		
		return number;
	}

}
