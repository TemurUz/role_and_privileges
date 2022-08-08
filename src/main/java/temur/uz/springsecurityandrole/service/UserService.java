package temur.uz.springsecurityandrole.service;

import temur.uz.springsecurityandrole.payload.UserDto;

import java.util.List;

public interface UserService {

    String createNewUser(UserDto dto);

    String updateUser(UserDto dto);

    List<UserDto> getUserList();

    UserDto getUser(Long id);

}
