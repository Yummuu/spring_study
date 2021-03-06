package com.yummuu.mmysql.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "log_view")
public class LogView implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name = "id")
	private long id;

	@Column(name = "uid")
	private String uid;

	@Column(name = "log_id")
	private String logId;

	@Column(name = "content")
	private String content;

	@Column(name = "ip")
	private String ip;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "updated_at")
	private Date updatedAt;



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}


	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
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
