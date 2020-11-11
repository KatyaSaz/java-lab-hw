package hw.regform.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static hw.regform.view.TextPropertiesConstants.INPUT_DATA;
import static hw.regform.view.TextPropertiesConstants.WRONG_INPUT_DATA;
import static hw.regform.view.TextPropertiesConstants.OUPUT_DATA;

/**
 * Class, that responsible for displaying data at the console
 * Realizes work with the resource bundle
 * @author Katya Sazonova
 */
public class View {

	private static String SPACE = " ";
	private static String BUNDLE_NAME_MESSAGES = "messages";
	public static ResourceBundle bundle;
	private String currentLocal;

	/**
	 * Constructor of class View (without parameters)
	 * initialise the bundle
	 */
	public View() {
		bundle = choseLocal("en", "EN");
		// bundle = choseLocal("ru", "RU");
	}

	/**
	 * Method, that return current language with which bundle works
	 * @return string, that have information about current language
	 */
	public String getCurrentLocal() {
		return currentLocal;
	}

	/**
	 * Method, that create resource bundle with given parameters
	 * @param language - must be in form of two small letters
	 * @param country -must be in form of two capital letters 
	 * @return created ResourceBundle
	 */
	private ResourceBundle choseLocal(String language, String country) {
		currentLocal = language;
		Locale locale = new Locale(language, country);
		ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_NAME_MESSAGES, locale);
		return bundle;
	}

	/**
	 * Method, concatenate several lines in one
	 * @param messages - strings, that must be united 
	 * @return concatenated line
	 */
	public static String concatenateStrings(String... messages) {
		StringBuilder contactStr = new StringBuilder();
		for (String str : messages) {
			contactStr.append(str);
			contactStr.append(SPACE);
		}
		return new String(contactStr);
	}
	
	/**
	 * Print string to console that comes as a parameter
	 * @param message - string, that will be print
	 */
	public void printMessage(String message) {
		System.out.println(message);
	}

	/**
	 * Method, generate a request for input, which will be shown
	 * to the user, from the bundle data
	 * @param message - string, that need to be printed after word 'Input'
	 */
	public void printInputStringBundle(String message) {
		printMessage(concatenateStrings(
				bundle.getString(INPUT_DATA), 
				bundle.getString(message)));
	}

	/**
	 * Method, generate a request for input (after wrong input)
	 * which will be shown to the user, from the bundle data
	 * @param message - string, that need to be printed after word 'Input'
	 */
	public void printWrongInputStringBundle(String message) {
		printMessage(concatenateStrings(
				bundle.getString(WRONG_INPUT_DATA), 
				bundle.getString(INPUT_DATA),
				bundle.getString(message)));
	}

	/**
	 * Method, that print data that was collected from user as one line
	 * @param message - string, that need to be printed after word 'Result:'
	 */
	public void printResultStringBundle(String message) {
		printMessage(concatenateStrings(
				bundle.getString(OUPUT_DATA), message));
	}
}
