package com.yummuu.mmysql.repository;

import com.yummuu.mmysql.model.AdminPermissions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminPermissionsJpaRepository extends JpaRepository<AdminPermissions,Long> {
}
