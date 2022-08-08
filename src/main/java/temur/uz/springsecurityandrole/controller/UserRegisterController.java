package temur.uz.springsecurityandrole.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import temur.uz.springsecurityandrole.payload.UserDto;
import temur.uz.springsecurityandrole.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/register")
@RequiredArgsConstructor
public class UserRegisterController {

    private final UserService userService;

    @PostMapping("/add")
    public ResponseEntity<String> addUser(@RequestBody UserDto userDto){
        return ResponseEntity.ok(userService.createNewUser(userDto));
    }

    @GetMapping("/list")
    public ResponseEntity<List<UserDto>> getUserList(){
        return ResponseEntity.ok(userService.getUserList());
    }

}
