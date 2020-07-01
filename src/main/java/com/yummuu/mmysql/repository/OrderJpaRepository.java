package com.yummuu.mmysql.repository;

import com.yummuu.mmysql.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderJpaRepository extends JpaRepository<Order,Long> {
}
