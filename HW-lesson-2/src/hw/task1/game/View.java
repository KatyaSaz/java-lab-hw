package hw.task1.game;

public class View {

	public static final String START_WORDS = "Hi! Let's play. Try to guess the number";
	public static final String WRONG_INPUT_NUMBER = "The input is not correct! ";
	public static final String OUTPUT_DONT_GUESS = "You are wrong, the mysterious number must be ";
	public static final String OUTPUT_RESULT_NUMBER = "Congratulations! You guessed it right! The secret number is ";
	public static final String OUTPUT_ATTEMPTS_AMOUNT = "Amount of attempts: ";
	public static final String OUTPUT_ATTEMPTS = "List of yours attempts: ";

	public void printMessage(String message) {
		System.out.println(message);
	}

	public void printMessageWithNumber(String message, int number) {
		System.out.println(message + number);
	}

	public void printDiap(int min, int max) {
		System.out.println("Input INT number from " + min + " to " + max + ":");

	}
}
