package temur.uz.springsecurityandrole.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import temur.uz.springsecurityandrole.entity.User;
import temur.uz.springsecurityandrole.payload.UserDto;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);

//    @Query("select new temur.uz.springsecurityandrole.payload.UserDto(" +
//            "u.firstName, u.lastName,u.userName, u.email, u.password, u.enabled, " +
//            "u.tokenExpired) from User u")
//    List<UserDto> findAllUserList();

    User findByUserName(String userUser);

    @Query("select u from User u where u.email = :email")
    User findByLogin(@Param("email") String email);

}
