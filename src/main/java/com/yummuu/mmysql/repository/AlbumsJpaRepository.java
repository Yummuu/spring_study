package com.yummuu.mmysql.repository;

import com.yummuu.mmysql.model.Albums;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumsJpaRepository extends JpaRepository<Albums,Long> {
}
