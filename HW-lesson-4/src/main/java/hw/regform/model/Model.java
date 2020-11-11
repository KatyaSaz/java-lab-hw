package hw.regform.model;

import java.util.ArrayList;
import java.util.List;

import hw.regform.view.TextPropertiesConstants;
import hw.regform.view.View;

/**
 * Class, contain data about 
 * all presented users (database of users)
 * @author Katya Sazonova
 */
public class Model {

	private List<User> usersBase = new ArrayList<>();
	
	/**
	 * Constructor of Model (without parameters)
	 * set default users to List 'userBase'
	 */
	public Model() {
		setUsersByDefault();
	}
	
	/**
	 * Method, create three default users
	 * and put them to List 'userBase'
	 */
	private void setUsersByDefault() {
		usersBase.add(new User("Katya", "kat2s@gmail.com", "+380972999090"));
		usersBase.add(new User("Sam", "samuel@kpi.ua", "+380509458761"));
		usersBase.add(new User("Igor", "igor_vor@mail.ru", "+380633876554"));
	}
	
	/**
	 * Method, check email on uniqueness comparing 
	 * it with email of each user from list 'userBase'
	 * @param email - email of new User
	 * @return true - if email unique, false - if email not unique
	 */
	private boolean checkIsEmailUnique(String email) {
		for(User user: usersBase) {
			if(user.getEmail().equals(email)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Method, add new User to List of users
	 * @param user - new user, for adding
	 * @throws NotUniqueEmailException - in case if email is not unique
	 */
	public void addUserToBase(User user) throws NotUniqueEmailException {
		if(!checkIsEmailUnique(user.getEmail())) {
			throw new NotUniqueEmailException(
					View.concatenateStrings(user.getEmail(),
						View.bundle.getString(
							TextPropertiesConstants.EXCEP_REPETABLE_EMAIL)));
		}
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
