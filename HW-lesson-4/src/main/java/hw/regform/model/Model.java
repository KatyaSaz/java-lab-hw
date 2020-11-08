package hw.regform.model;

import java.util.ArrayList;
import java.util.List;

public class Model {

	private List<User> usersBase = new ArrayList<>();

	public void addUserToBase(User user) {
		usersBase.add(user);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (User user : usersBase) {
			sb.append(user.toString() + '\n');
		}
		return new String(sb);
	}
}
