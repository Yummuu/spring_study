package com.yummuu.mmysql.repository;

import com.yummuu.mmysql.model.Videos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideosJpaRepository extends JpaRepository<Videos,Long> {
}
