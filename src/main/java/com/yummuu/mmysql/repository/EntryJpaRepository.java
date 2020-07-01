package com.yummuu.mmysql.repository;

import com.yummuu.mmysql.model.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryJpaRepository extends JpaRepository<Entry,Long> {
}
