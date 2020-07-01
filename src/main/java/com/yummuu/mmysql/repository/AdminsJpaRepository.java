package com.yummuu.mmysql.repository;

import com.yummuu.mmysql.model.Admins;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminsJpaRepository extends JpaRepository<Admins,Long> {
}
