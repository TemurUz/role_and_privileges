package temur.uz.springsecurityandrole.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import temur.uz.springsecurityandrole.entity.Role;
import temur.uz.springsecurityandrole.mapper.RoleMapper;
import temur.uz.springsecurityandrole.payload.RoleDto;
import temur.uz.springsecurityandrole.repository.RoleRepository;
import temur.uz.springsecurityandrole.service.RoleService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private  final RoleRepository roleRepository;

    private final RoleMapper roleMapper;
    @Override
    public String createRole(RoleDto role) {
        roleRepository.save(roleMapper.toDto(role));
        return "Create new Role";
    }

    @Override
    public List<Role> getRoles() {
        return roleRepository.findAll();
    }
}
