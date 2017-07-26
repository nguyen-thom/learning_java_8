package ttv.com.vn.pattern.combonitor;

import java.util.Optional;

public interface ValidationResult{
    
    boolean isValid();
    
    public String a = "HELLO";
    
   Optional<String> getReason();
}
