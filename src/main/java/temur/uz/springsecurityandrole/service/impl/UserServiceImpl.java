package temur.uz.springsecurityandrole.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import temur.uz.springsecurityandrole.mapper.UserMapper;
import temur.uz.springsecurityandrole.payload.UserDto;
import temur.uz.springsecurityandrole.repository.UserRepository;
import temur.uz.springsecurityandrole.service.UserService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    @Override
    public String createNewUser(UserDto dto) {
//        userRepository.save(userMapper.to(dto));
        return "New user successfully created";
    }

    @Override
    public String updateUser(UserDto dto) {
        return null;
    }

    @Override
    public List<UserDto> getUserList() {
        return null;
    }

    @Override
    public UserDto getUser(Long id) {
        return null;
    }
}
