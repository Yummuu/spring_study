package com.yummuu.mmysql.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "games")
public class Games implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name = "id")
	private long id;

	@Column(name = "race_id")
	private long raceId;

	@Column(name = "title")
	private String title;

	@Column(name = "images")
	private String images;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private double price;

	@Column(name = "quantity")
	private long quantity;

	@Column(name = "stock")
	private long stock;

	@Column(name = "sale_num")
	private long saleNum;

	@Column(name = "enrolment_num")
	private long enrolmentNum;

	@Column(name = "start_enroll")
	private Date startEnroll;

	@Column(name = "end_enroll")
	private Date endEnroll;

	@Column(name = "status")
	private long status;

	@Column(name = "lng_lat")
	private String lngLat;

	@Column(name = "min_num")
	private long minNum;

	@Column(name = "max_num")
	private long maxNum;

	@Column(name = "male")
	private long male;

	@Column(name = "female")
	private long female;

	@Column(name = "coupon_price")
	private long couponPrice;

	@Column(name = "min_age")
	private Date minAge;

	@Column(name = "max_age")
	private Date maxAge;

	@Column(name = "created_id")
	private String createdId;

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


	public long getRaceId() {
		return raceId;
	}

	public void setRaceId(long raceId) {
		this.raceId = raceId;
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


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}


	public long getStock() {
		return stock;
	}

	public void setStock(long stock) {
		this.stock = stock;
	}


	public long getSaleNum() {
		return saleNum;
	}

	public void setSaleNum(long saleNum) {
		this.saleNum = saleNum;
	}


	public long getEnrolmentNum() {
		return enrolmentNum;
	}

	public void setEnrolmentNum(long enrolmentNum) {
		this.enrolmentNum = enrolmentNum;
	}


	public Date getStartEnroll() {
		return startEnroll;
	}

	public void setStartEnroll(Date startEnroll) {
		this.startEnroll = startEnroll;
	}


	public Date getEndEnroll() {
		return endEnroll;
	}

	public void setEndEnroll(Date endEnroll) {
		this.endEnroll = endEnroll;
	}


	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}


	public String getLngLat() {
		return lngLat;
	}

	public void setLngLat(String lngLat) {
		this.lngLat = lngLat;
	}


	public long getMinNum() {
		return minNum;
	}

	public void setMinNum(long minNum) {
		this.minNum = minNum;
	}


	public long getMaxNum() {
		return maxNum;
	}

	public void setMaxNum(long maxNum) {
		this.maxNum = maxNum;
	}


	public long getMale() {
		return male;
	}

	public void setMale(long male) {
		this.male = male;
	}


	public long getFemale() {
		return female;
	}

	public void setFemale(long female) {
		this.female = female;
	}


	public long getCouponPrice() {
		return couponPrice;
	}

	public void setCouponPrice(long couponPrice) {
		this.couponPrice = couponPrice;
	}


	public Date getMinAge() {
		return minAge;
	}

	public void setMinAge(Date minAge) {
		this.minAge = minAge;
	}


	public Date getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(Date maxAge) {
		this.maxAge = maxAge;
	}


	public String getCreatedId() {
		return createdId;
	}

	public void setCreatedId(String createdId) {
		this.createdId = createdId;
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
