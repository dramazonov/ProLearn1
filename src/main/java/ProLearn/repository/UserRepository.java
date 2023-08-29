package ProLearn.repository;

import ProLearn.entity.Worker.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    @Query(value = "select *\n"+
            "from users u\n"+
            "join user_roles ur on u.id = ur.user_id\n"+
            "join role r on r.id = ur.role_id\n"+
           " where u.nick_name=:nickName and(r.role_name<>'ROLE_TEACHER'and role_name<>'ROLE_MENTOR' and role_name<>'ROLE_CASHIER')",nativeQuery = true)
    Optional<User> findAllByNickNameAndRolesNotIn(@Param("nickName")String nickName);
}
