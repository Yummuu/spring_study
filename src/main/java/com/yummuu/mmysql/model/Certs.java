package com.yummuu.mmysql.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "certs")
public class Certs implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name = "id")
	private long id;

	@Column(name = "races_id")
	private long racesId;

	@Column(name = "games_id")
	private long gamesId;

	@Column(name = "title")
	private String title;

	@Column(name = "images")
	private String images;

	@Column(name = "css")
	private String css;

	@Column(name = "description")
	private String description;

	@Column(name = "type")
	private long type;

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


	public long getRacesId() {
		return racesId;
	}

	public void setRacesId(long racesId) {
		this.racesId = racesId;
	}


	public long getGamesId() {
		return gamesId;
	}

	public void setGamesId(long gamesId) {
		this.gamesId = gamesId;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}


	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public long getType() {
		return type;
	}

	public void setType(long type) {
		this.type = type;
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
