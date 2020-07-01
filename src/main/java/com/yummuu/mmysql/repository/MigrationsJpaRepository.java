package com.yummuu.mmysql.repository;

import com.yummuu.mmysql.model.Migrations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MigrationsJpaRepository extends JpaRepository<Migrations,Long> {
}
