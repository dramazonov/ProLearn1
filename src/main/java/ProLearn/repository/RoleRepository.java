package ProLearn.repository;

import ProLearn.entity.Worker.Role;
import ProLearn.entity.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    List<Role> findAllByRoleName(RoleName roleName);
}
