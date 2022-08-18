package africa.semicolon.goodreads.controllers.requestsAndResponses;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class LoginRequest {
    private String email;
    private String password;
}
