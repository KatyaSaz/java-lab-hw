package hw.regform.model;

/**
 * My own class-exception
 * @author Katya Sazonova
 *
 */
public class NotUniqueEmailException extends Exception{

	public NotUniqueEmailException(String message) {
		super(message);
	}
}
