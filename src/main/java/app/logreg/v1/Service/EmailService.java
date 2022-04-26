package app.logreg.v1.Service;

import app.logreg.v1.DAO.EmailSender;
import lombok.AllArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailService implements EmailSender {
    private final JavaMailSender mailSender;
    @Override
    public void send(String to, String email) {

    }
}
