package app.logreg.v1.Registration;

import app.logreg.v1.Service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/register")
@AllArgsConstructor
public class RegistrationController {

    private RegistrationService registrationService;

    public String register(@RequestBody RegistragionRequest request) {
        return registrationService.register(request);
    }
}
