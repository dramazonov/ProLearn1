package ProLearn.service;

import ProLearn.dto.RegisterDto;
import ProLearn.dto.Result;
import ProLearn.entity.Worker.User;
import ProLearn.entity.enums.RoleName;
import ProLearn.repository.RoleRepository;
import ProLearn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.HashSet;

@Service
public class AuthService implements UserDetailsService {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String nickName) throws UsernameNotFoundException {
        return userRepository.findAllByNickNameAndRolesNotIn(nickName).orElseThrow(() -> new UsernameNotFoundException(nickName + " doesn't find"));
    }

    public Result register(RegisterDto registerDto) {
        User user = new User();
        user.setFirstName(registerDto.getFirstName());
        user.setLastName(registerDto.getLastName());
        user.setNickName(registerDto.getNickName());
        user.setMiddleName(registerDto.getMiddleName());
        user.setPassword(passwordEncoder.encode(registerDto.getPassword()));
        user.setPhoneNumber(registerDto.getPhoneNumber());
        user.setBirthDate(registerDto.getBirthDate());
        user.setRoles(new HashSet<>(roleRepository.findAllByRoleName(RoleName.ROLE_ADMIN)));
        userRepository.save(user);
        return new Result("Success", true);
    }
}
