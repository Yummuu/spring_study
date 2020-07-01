package com.yummuu.mmysql.repository;

import com.yummuu.mmysql.model.Articles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticlesJpaRepository extends JpaRepository<Articles,Long> {
}
