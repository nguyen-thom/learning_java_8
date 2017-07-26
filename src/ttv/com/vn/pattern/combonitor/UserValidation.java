package ttv.com.vn.pattern.combonitor;

import java.util.function.Function;
import java.util.function.Predicate;

public interface UserValidation extends Function<User, ValidationResult>{
	
	static UserValidation nameIsNotEmpty(){
		return hold(user -> user.name.trim().isEmpty(), "Name is empty");
	}
	
	static UserValidation emailContainAtSign(){
		return hold(user -> user.email.contains("@"), "Name is empty");
	}
	static UserValidation hold(Predicate<User> p, String message){
		return user -> {
			final boolean hasError = p.test(user);
			return hasError ? ValidationResult.valid() : ValidationResult.invalid(message);
		};
		
		
		
		
		//return user -> p.test(user) ? ValidationResult.valid() : ValidationResult.invalid(message);
	}

	default UserValidation and(UserValidation after){
		return user -> {
			final ValidationResult result = this.apply(user);
			return result.isValid()? after.apply(user) : result;
		};
	}
}
