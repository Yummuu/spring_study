package com.yummuu.mmysql.repository;

import com.yummuu.mmysql.model.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesJpaRepository extends JpaRepository<Games,Long> {
}
