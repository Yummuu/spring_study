package com.yummuu.mmysql.repository;

import com.yummuu.mmysql.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileJpaRepository extends JpaRepository<UserProfile,Long> {
}
