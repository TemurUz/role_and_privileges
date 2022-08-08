package temur.uz.springsecurityandrole.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import temur.uz.springsecurityandrole.entity.Role;
import temur.uz.springsecurityandrole.payload.RoleDto;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);
    Role toDto(RoleDto roleDto);
}
