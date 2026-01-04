package com.community.demo.service;

import com.community.demo.dto.UserDTO;
import com.community.demo.entity.AuthRole;
import com.community.demo.entity.User;
import com.community.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    @Override
    public String register(UserDTO userDTO) {
        userDTO.setPwd(passwordEncoder.encode(userDTO.getPwd()));
        User user = convertDtoToEntity(userDTO);
        user.addAuth(AuthRole.USER);

        return userRepository.save(user).getEmail();
    }

    @Override
    public void lastLoginUpdate(String name) {

    }
}
