package dev.zhulidov.labrab8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.zhulidov.labrab8.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
