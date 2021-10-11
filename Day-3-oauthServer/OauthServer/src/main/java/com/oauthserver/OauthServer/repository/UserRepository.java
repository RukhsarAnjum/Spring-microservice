package com.oauthserver.OauthServer.repository;
import com.oauthserver.OauthServer.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author : admi on 6/23/2020
 */
public interface UserRepository extends JpaRepository<UserEntity,Long> {

    UserEntity findByUserNameAndStatus(String userName, String status);

    UserEntity findByUserName(String userName);
}