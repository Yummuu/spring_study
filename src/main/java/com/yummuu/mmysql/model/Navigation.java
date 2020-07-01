package com.yummuu.mmysql.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "navigation")
public class Navigation implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name = "id")
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "images")
	private String images;

	@Column(name = "url")
	private String url;

	@Column(name = "sort")
	private long sort;

	@Column(name = "status")
	private long status;

	@Column(name = "deleted_at")
	private Date deletedAt;

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


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}


	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


	public long getSort() {
		return sort;
	}

	public void setSort(long sort) {
		this.sort = sort;
	}


	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}


	public Date getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
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
