package app.logreg.v1.Security.Config;

import java.time.LocalDateTime;

public class ConfirmationToken {
    private Long id;
    private String token;
    private LocalDateTime localDateTime;
    private LocalDateTime expiredAt;
}
