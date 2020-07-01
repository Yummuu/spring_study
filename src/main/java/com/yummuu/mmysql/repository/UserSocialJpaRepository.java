package com.yummuu.mmysql.repository;

import com.yummuu.mmysql.model.UserSocial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSocialJpaRepository extends JpaRepository<UserSocial,Long> {
}
