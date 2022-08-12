package temur.uz.springsecurityandrole.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import temur.uz.springsecurityandrole.entity.User;
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

    private final PasswordEncoder passwordEncoder;

    @Override
    public String createNewUser(UserDto dto) {
        if (!checkPassword(dto.getPassword())){
            return "This is an error here, Parol uzunligi 4 tadan kam";
        }
        if (userRepository.existsByEmail(dto.getEmail())){
            return "Already registered user";
        }
        User user = userMapper.to(dto);
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        userRepository.save(user);
        return "User successfully created";
    }

    @Override
    public String updateUser(UserDto dto) {
        return null;
    }

    @Override
    public List<UserDto> getUserList() {
        return  null;
    }

    @Override
    public UserDto getUser(Long id) {
        return null;
    }

    private boolean checkPassword(String password){
        return password.length()>4;
    }
}
