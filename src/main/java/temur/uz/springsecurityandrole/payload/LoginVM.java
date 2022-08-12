package temur.uz.springsecurityandrole.payload;

import lombok.Data;

@Data
public class LoginVM {
    private String username;
    private String password;
}
