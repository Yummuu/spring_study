package com.yummuu.mmysql.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "view_nav")
public class ViewNav implements Serializable{
	@Id
	@Column(name = "navigation_id")
	private long navigationId;

	@Column(name = "source_id")
	private String sourceId;

	@Column(name = "title")
	private String title;



	public long getNavigationId() {
		return navigationId;
	}

	public void setNavigationId(long navigationId) {
		this.navigationId = navigationId;
	}


	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
