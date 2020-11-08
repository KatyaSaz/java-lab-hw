package hw.regform.controller;

import java.util.Scanner;

import hw.regform.model.Model;
import hw.regform.model.User;
import hw.regform.view.View;

import static hw.regform.model.RegexConstants.*;
import static hw.regform.view.TextPropertiesConstants.*;

public class Controller {

	private Model model;
	private View view;

	public Controller(Model model, View view) {
		super();
		this.model = model;
		this.view = view;
	}

	public void workMethod() {
		Scanner sc = new Scanner(System.in);
		User user = inputUser(sc);
		model.addUserToBase(user);
		view.printResultStringBundle(user.toString());
	}

	public User inputUser(Scanner sc) {
		UtilityController uc = new UtilityController(sc, view);
		String locale = view.getCurrentLocal();
		User user = new User();

		String regexpName = (locale.equals("en")) ? REG_NAME_ENG : REG_NAME_RUS;
		user.setName(uc.inputStringWithScanner(FIRST_NAME, regexpName));
		user.setEmail(uc.inputStringWithScanner(EMAIL_DATA, REG_EMAIL_FOR_ALL));
		user.setPhone(uc.inputStringWithScanner(PHONE_DATA, REG_PHONE_FOR_ALL));
		return user;
	}

}
