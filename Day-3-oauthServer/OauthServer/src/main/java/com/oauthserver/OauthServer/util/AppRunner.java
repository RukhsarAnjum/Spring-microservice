package com.oauthserver.OauthServer.util;

import com.oauthserver.OauthServer.constraint.UserStatus;
import com.oauthserver.OauthServer.model.PersonProfileEntity;
import com.oauthserver.OauthServer.model.UserEntity;
import com.oauthserver.OauthServer.model.UserRoleEntity;
import com.oauthserver.OauthServer.repository.RoleRepository;
import com.oauthserver.OauthServer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @Author : admi on 6/26/2020
 */
@Component
public class AppRunner implements CommandLineRunner {

    @Autowired private RoleRepository roleRepository;
    @Autowired private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        //Initially All will be delete when server startup
//        roleRepository.deleteAll();
        UserRoleEntity userRoleEntity = new UserRoleEntity(null,"ROLE_ADMIN", UserStatus.ACTIVE.getStatus(), LocalDateTime.now());
        PersonProfileEntity personProfileEntity = new PersonProfileEntity();
        roleRepository.save(userRoleEntity);
        roleRepository.save(new UserRoleEntity(null,"ROLE_USER", UserStatus.ACTIVE.getStatus(), LocalDateTime.now()));
//        roleRepository.save(new UserRoleEntity(null,"ROLE_PATIENT", UserStatus.ACTIVE.getStatus(), LocalDateTime.now()));

//        try {
//            userRepository.save(new UserEntity(
//                    123L, "rukhsar",
//                    UserStatus.ACTIVE.getStatus(),
//                    "abc123",
//                    LocalDateTime.now(),
//                    userRoleEntity,
//                    null));
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
       System.out.println("Role insert successfully.");
    }
}

