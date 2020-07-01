package com.yummuu.mmysql.repository;

import com.yummuu.mmysql.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesJpaRepository extends JpaRepository<Categories,Long> {
}
