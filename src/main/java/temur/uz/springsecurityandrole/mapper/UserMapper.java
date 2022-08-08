package temur.uz.springsecurityandrole.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import temur.uz.springsecurityandrole.entity.User;
import temur.uz.springsecurityandrole.payload.UserDto;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    User to(UserDto userDto);
}
