package temur.uz.springsecurityandrole.payload;

import lombok.Data;
import temur.uz.springsecurityandrole.entity.Role;

import java.util.List;

@Data
public class UserDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean enabled;
    private boolean tokenExpired;
    private List<Role> roles;
}
