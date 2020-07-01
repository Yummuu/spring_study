package com.yummuu.mmysql.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "category_race")
public class CategoryRace implements Serializable{
	@Id
	@Column(name = "category_id")
	private long categoryId;

	@Column(name = "race_id")
	private long raceId;



	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}


	public long getRaceId() {
		return raceId;
	}

	public void setRaceId(long raceId) {
		this.raceId = raceId;
	}

}
