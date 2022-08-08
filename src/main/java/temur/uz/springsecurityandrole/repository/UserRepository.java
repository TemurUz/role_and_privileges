package temur.uz.springsecurityandrole.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import temur.uz.springsecurityandrole.entity.User;
import temur.uz.springsecurityandrole.payload.UserDto;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select new temur.uz.springsecurityandrole.payload.UserDto(" +
            "u.firstName, u.lastName, u.email, u.password, u.enabled, " +
            "u.tokenExpired) from User u join Role r r.user.id = u.")
    List<UserDto> findAllUserList();

}
