package dev.zhulidov.labrab8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.zhulidov.labrab8.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

}
