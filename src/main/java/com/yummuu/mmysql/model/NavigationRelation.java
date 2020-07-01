package com.yummuu.mmysql.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "navigation_relation")
public class NavigationRelation implements Serializable{
	@Id
	@Column(name = "navigation_id")
	private long navigationId;

	@Column(name = "source_id")
	private String sourceId;

	@Column(name = "type")
	private String type;



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


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
