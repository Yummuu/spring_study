package com.yummuu.mmysql.repository;

import com.yummuu.mmysql.model.Scores;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoresJpaRepository extends JpaRepository<Scores,Long> {
}
