package com.yummuu.mmysql.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "notifications")
public class Notifications implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name = "id")
	private String id;

	@Column(name = "type")
	private String type;

	@Column(name = "notifiable_type")
	private String notifiableType;

	@Column(name = "notifiable_id")
	private long notifiableId;

	@Column(name = "data")
	private String data;

	@Column(name = "read_at")
	private Date readAt;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "updated_at")
	private Date updatedAt;



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public String getNotifiableType() {
		return notifiableType;
	}

	public void setNotifiableType(String notifiableType) {
		this.notifiableType = notifiableType;
	}


	public long getNotifiableId() {
		return notifiableId;
	}

	public void setNotifiableId(long notifiableId) {
		this.notifiableId = notifiableId;
	}


	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}


	public Date getReadAt() {
		return readAt;
	}

	public void setReadAt(Date readAt) {
		this.readAt = readAt;
	}


	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
