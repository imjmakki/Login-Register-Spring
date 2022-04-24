package app.logreg.v1.DAO;

import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface StudentRepository {
}
