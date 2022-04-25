package app.logreg.v1.Service;

import app.logreg.v1.DAO.RegistrationRequest;
import app.logreg.v1.Security.Config.EmailValidator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {
    private EmailValidator emailValidator;
    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.test(request.getEmail());
        return "it works";
    }
}
