package com.yummuu.mmysql.repository;

import com.yummuu.mmysql.model.Photos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotosJpaRepository extends JpaRepository<Photos,Long> {
}
