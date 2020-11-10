package hw.regform.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Class, contain data about 
 * all presented users (database of users)
 * @author Katya Sazonova
 */
public class Model {

	private List<User> usersBase = new ArrayList<>();

	/**
	 * Method, add new User to List of users
	 * @param user - new user, for adding
	 */
	public void addUserToBase(User user) {
		usersBase.add(user);
	}
	
	/**
	 * Method - override toString()
	 * @return info about all users as string separated by '\n'
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (User user : usersBase) {
			sb.append(user.toString() + '\n');
		}
		return new String(sb);
	}
}
