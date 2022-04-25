package app.logreg.v1.Service;

import app.logreg.v1.DAO.ConfirmationTokenRepository;
import app.logreg.v1.Security.Config.ConfirmationToken;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {

    private final ConfirmationTokenRepository confirmationTokenRepository;
    public void saveConfirmationToken(ConfirmationToken token) {
        confirmationTokenRepository.save(token);
    }
}
