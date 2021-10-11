package com.oauthserver.OauthServer.service;

import com.oauthserver.OauthServer.model.UserRoleEntity;
import com.oauthserver.OauthServer.repository.RoleRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : admi on 6/23/2020
 */
@Slf4j
@Service
public class RoleServiceImpl implements RoleService{

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<UserRoleEntity> getAllRoles() {
        LOGGER.info("getAllRoles method call...");
        return roleRepository.findAll();
    }
}