package temur.uz.springsecurityandrole.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import temur.uz.springsecurityandrole.entity.Role;
import temur.uz.springsecurityandrole.payload.RoleDto;
import temur.uz.springsecurityandrole.service.RoleService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/role")
public class RoleController {

    private final RoleService roleService;

    @PostMapping("add")
    public ResponseEntity<?> createRole(@RequestBody RoleDto dto){
        return ResponseEntity.ok(roleService.createRole(dto));
    }
    @GetMapping("list")
    public ResponseEntity<List<Role>> getRoles(){
        return ResponseEntity.ok(roleService.getRoles());
    }

}
