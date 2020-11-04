package hw.hello;

public class View {

	public static final String INPUT_FIRST_WORD = "Input first word ('Hello'):";
	public static final String INPUT_SECOND_WORD = "Input second word ('world'):";
	public static final String WRONR_INPUT_WORD = "The word is not correct! Try again!";
	public static final String OUTPUT_RESULT = "Result sentance: ";

	public void printMessage(String message) {
		System.out.println(message);
	}

	public void printResult(String message, String sentance) {
		System.out.println(message + sentance);
	}

}
