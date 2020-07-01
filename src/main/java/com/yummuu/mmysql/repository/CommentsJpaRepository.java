package com.yummuu.mmysql.repository;

import com.yummuu.mmysql.model.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsJpaRepository extends JpaRepository<Comments,Long> {
}
