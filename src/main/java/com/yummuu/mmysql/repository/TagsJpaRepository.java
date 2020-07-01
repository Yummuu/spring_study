package com.yummuu.mmysql.repository;

import com.yummuu.mmysql.model.Tags;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagsJpaRepository extends JpaRepository<Tags,Long> {
}
