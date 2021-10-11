package com.oauthserver.OauthServer.repository;

import com.oauthserver.OauthServer.model.PersonAddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author : admi on 6/24/2020
 */
public interface PersonAddressRepository extends JpaRepository<PersonAddressEntity,Long> {
}