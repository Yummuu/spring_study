package com.yummuu.mmysql.repository;

import com.yummuu.mmysql.model.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationsJpaRepository extends JpaRepository<Notifications,Long> {
}
