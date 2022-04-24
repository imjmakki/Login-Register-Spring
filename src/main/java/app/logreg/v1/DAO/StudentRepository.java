package app.logreg.v1.DAO;

import app.logreg.v1.AppUser.AppUser;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional(readOnly = true)
public interface StudentRepository {
    Optional<AppUser> findByEmail(String email);
}
