package hw.regform.view;

import java.util.Locale;
import java.util.ResourceBundle;

import static hw.regform.view.TextPropertiesConstants.INPUT_DATA;
import static hw.regform.view.TextPropertiesConstants.WRONG_INPUT_DATA;
import static hw.regform.view.TextPropertiesConstants.OUPUT_DATA;

public class View {

	private static String BUNDLE_NAME_MESSAGES = "messages";
	public static ResourceBundle bundle;
	private String currentLocal;

	public View() {
		bundle = choseLocal("en", "EN");
		// bundle = choseLocal("ru", "RU");
	}

	public String getCurrentLocal() {
		return currentLocal;
	}

	private ResourceBundle choseLocal(String language, String country) {
		currentLocal = language;
		Locale locale = new Locale(language, country);
		ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_NAME_MESSAGES, locale);
		return bundle;
	}

	public void printMessage(String message) {
		System.out.println(message);
	}

	public String concatenateStrings(String... messages) {
		StringBuilder contactStr = new StringBuilder();
		for (String str : messages) {
			contactStr = contactStr.append(str);
		}
		return new String(contactStr);
	}

	public void printInputStringBundle(String message) {
		printMessage(concatenateStrings(
				bundle.getString(INPUT_DATA), 
				bundle.getString(message)));
	}

	public void printWrongInputStringBundle(String message) {
		printMessage(concatenateStrings(
				bundle.getString(WRONG_INPUT_DATA), 
				bundle.getString(INPUT_DATA),
				bundle.getString(message)));
	}

	public void printResultStringBundle(String message) {
		printMessage(concatenateStrings(
				bundle.getString(OUPUT_DATA), message));
	}

}
