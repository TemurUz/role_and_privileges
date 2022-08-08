package temur.uz.springsecurityandrole.payload;

import lombok.Data;
import temur.uz.springsecurityandrole.entity.Privilege;

import java.util.List;

@Data
public class RoleDto {
    private Long id;
    private List<Privilege> privileges;
    private String name;
}
