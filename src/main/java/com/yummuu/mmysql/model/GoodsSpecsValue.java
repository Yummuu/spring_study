package com.yummuu.mmysql.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "goods_specs_value")
public class GoodsSpecsValue implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name = "id")
	private long id;

	@Column(name = "specs_id")
	private long specsId;

	@Column(name = "specs_key")
	private String specsKey;

	@Column(name = "specs_value")
	private String specsValue;



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public long getSpecsId() {
		return specsId;
	}

	public void setSpecsId(long specsId) {
		this.specsId = specsId;
	}


	public String getSpecsKey() {
		return specsKey;
	}

	public void setSpecsKey(String specsKey) {
		this.specsKey = specsKey;
	}


	public String getSpecsValue() {
		return specsValue;
	}

	public void setSpecsValue(String specsValue) {
		this.specsValue = specsValue;
	}

}
