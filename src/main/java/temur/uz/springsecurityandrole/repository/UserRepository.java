package temur.uz.springsecurityandrole.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import temur.uz.springsecurityandrole.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
