package com.yummuu.mmysql.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "entry_detail")
public class EntryDetail implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name = "id")
	private long id;

	@Column(name = "entry_id")
	private String entryId;

	@Column(name = "games_id")
	private long gamesId;

	@Column(name = "name")
	private String name;

	@Column(name = "content")
	private String content;



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getEntryId() {
		return entryId;
	}

	public void setEntryId(String entryId) {
		this.entryId = entryId;
	}


	public long getGamesId() {
		return gamesId;
	}

	public void setGamesId(long gamesId) {
		this.gamesId = gamesId;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
