package temur.uz.springsecurityandrole.service;

import temur.uz.springsecurityandrole.entity.Role;
import temur.uz.springsecurityandrole.payload.RoleDto;

import java.util.List;

public interface RoleService {
    String createRole(RoleDto role);

    List<Role> getRoles();
}
