package com.yummuu.mmysql.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "admin_permission_role")
public class AdminPermissionRole implements Serializable{
	@Id
	@Column(name = "permission_id")
	private long permissionId;

	@Column(name = "role_id")
	private long roleId;

	@Column(name = "crud_operation")
	private long crudOperation;



	public long getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(long permissionId) {
		this.permissionId = permissionId;
	}


	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}


	public long getCrudOperation() {
		return crudOperation;
	}

	public void setCrudOperation(long crudOperation) {
		this.crudOperation = crudOperation;
	}

}
