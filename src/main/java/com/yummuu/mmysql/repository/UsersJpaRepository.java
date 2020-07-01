package com.yummuu.mmysql.repository;

import com.yummuu.mmysql.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersJpaRepository extends JpaRepository<Users,Long> {
}
