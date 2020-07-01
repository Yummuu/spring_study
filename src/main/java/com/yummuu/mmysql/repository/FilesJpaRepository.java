package com.yummuu.mmysql.repository;

import com.yummuu.mmysql.model.Files;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilesJpaRepository extends JpaRepository<Files,Long> {
}
