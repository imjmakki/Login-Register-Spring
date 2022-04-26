package app.logreg.v1.DAO;

public interface EmailSender {
    void send(String to, String email);
}
