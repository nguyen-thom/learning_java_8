package ttv.com.vn.pattern.combonitor;

public class Main {
	
	public static void main(String... args){
		UserValidation validation = UserValidation.nameIsNotEmpty().and(UserValidation.emailContainAtSign());
		User gregor = new User("", 30, "mail@mailinator.com");

		ValidationResult result = validation.apply(gregor);
		result.getReason().ifPresent(System.out::println);
	}

}
