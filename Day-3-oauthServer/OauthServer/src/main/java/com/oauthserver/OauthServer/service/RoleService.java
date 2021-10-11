package com.oauthserver.OauthServer.service;

import com.oauthserver.OauthServer.model.UserRoleEntity;


import java.util.List;


/**
 * @Author : admi on 6/23/2020
 */
public interface RoleService {

    List<UserRoleEntity> getAllRoles();

}