package hw.regform.model;

/**
 * Class of object 'User'
 * @author Katya Sazonova
 */
public class User {

	private String name;
	private String email;
	private String phone;

	/**
	 * Constructor of class User (without parameters)
	 */
	public User() {
	}

	/**
	 * Constructor of class User (with parameters)
	 * @param name - name of user
	 * @param email - email of this user
	 * @param phone - phone number of this user
	 */
	public User(String name, String email, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	/**
	 * Getter for field 'name'
	 * @return name of user as string
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for field 'name'
	 * @param name - name of user
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for field 'email'
	 * @return email as string
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter for field 'email'
	 * @param email - email of this user
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Getter for field 'phone'
	 * @return phone number as string
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Setter for field 'phone'
	 * @param phone - phone number of this user
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Method - override toString()
	 * @return all fields separated by a spaces as one line
	 */
	@Override
	public String toString() {
		return name + " " + email + " " + phone + " ";
	}
}
