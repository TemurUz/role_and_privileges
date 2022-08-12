package temur.uz.springsecurityandrole.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import temur.uz.springsecurityandrole.entity.Role;
import temur.uz.springsecurityandrole.model.enamuration.Status;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private boolean enabled;
    private boolean tokenExpired;
    private List<Role> roles;
}
