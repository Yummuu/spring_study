package com.yummuu.mmysql.repository;

import com.yummuu.mmysql.model.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsJpaRepository extends JpaRepository<Goods,Long> {
}
