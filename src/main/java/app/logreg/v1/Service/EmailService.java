package app.logreg.v1.Service;

import app.logreg.v1.DAO.EmailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements EmailSender {
    @Override
    public void send(String to, String email) {

    }
}
