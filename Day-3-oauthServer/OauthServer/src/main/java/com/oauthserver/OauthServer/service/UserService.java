package com.oauthserver.OauthServer.service;

import com.oauthserver.OauthServer.dto.UserSignupDTO;
import com.oauthserver.OauthServer.model.UserEntity;


/**
 * @Author : admi on 6/23/2020
 */
public interface UserService {

    String signup(UserSignupDTO userSignupDTO);

    UserEntity findByUserName(String userName);
}