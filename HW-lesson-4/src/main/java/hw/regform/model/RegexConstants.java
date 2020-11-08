package hw.regform.model;

public interface RegexConstants {
	// regexp for 'name'
	String REG_NAME_ENG = "^[A-Z][a-z]{2,15}$";
	String REG_NAME_RUS = "^[А-ЯЁ][а-яё]{2,15}$";

	// regexp for 'email'
	String REG_EMAIL_FOR_ALL = "^((([0-9A-Za-z]{1}[-0-9A-z\\.]{1,}[0-9A-Za-z]{1}))"
			+ "@([-0-9A-Za-z]{1,}\\.){1,2}[-A-Za-z]{2,})$";

	// regexp for 'phone'
	String REG_PHONE_FOR_ALL = "^(\\+380)[0-9]{9}$";

}
