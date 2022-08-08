package temur.uz.springsecurityandrole.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import temur.uz.springsecurityandrole.payload.UserDto;
import temur.uz.springsecurityandrole.service.UserService;

@RestController
@RequestMapping("/api/register")
@RequiredArgsConstructor
public class UserRegisterController {

    private final UserService userService;

    @PostMapping("/add")
    public ResponseEntity<String> addUser(@RequestBody UserDto userDto){
        return ResponseEntity.ok(userService.createNewUser(userDto));
    }

}
