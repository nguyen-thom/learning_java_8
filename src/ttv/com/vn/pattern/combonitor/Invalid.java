package ttv.com.vn.pattern.combonitor;

import java.util.Optional;

public class Invalid implements ValidationResult {

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<String> getReason() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Invalid(String reason) {
		// TODO Auto-generated method stub
		
	}

}
