package com.yummuu.mmysql.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "races")
public class Races implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name = "id")
	private long id;

	@Column(name = "source_id")
	private String sourceId;

	@Column(name = "title")
	private String title;

	@Column(name = "images")
	private String images;

	@Column(name = "description")
	private String description;

	@Column(name = "seo_keyword")
	private String seoKeyword;

	@Column(name = "seo_description")
	private String seoDescription;

	@Column(name = "seo_title")
	private String seoTitle;

	@Column(name = "view_num")
	private long viewNum;

	@Column(name = "like_num")
	private long likeNum;

	@Column(name = "comment_num")
	private long commentNum;

	@Column(name = "link_num")
	private long linkNum;

	@Column(name = "status")
	private long status;

	@Column(name = "enrolment_num")
	private long enrolmentNum;

	@Column(name = "start_time")
	private Date startTime;

	@Column(name = "end_time")
	private Date endTime;

	@Column(name = "start_enroll")
	private Date startEnroll;

	@Column(name = "end_enroll")
	private Date endEnroll;

	@Column(name = "province")
	private long province;

	@Column(name = "city")
	private long city;

	@Column(name = "area")
	private long area;

	@Column(name = "address")
	private String address;

	@Column(name = "lng_lat")
	private String lngLat;

	@Column(name = "sponsor")
	private String sponsor;

	@Column(name = "sort")
	private long sort;

	@Column(name = "deleted_at")
	private Date deletedAt;

	@Column(name = "created_id")
	private String createdId;

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


	public String getSeoKeyword() {
		return seoKeyword;
	}

	public void setSeoKeyword(String seoKeyword) {
		this.seoKeyword = seoKeyword;
	}


	public String getSeoDescription() {
		return seoDescription;
	}

	public void setSeoDescription(String seoDescription) {
		this.seoDescription = seoDescription;
	}


	public String getSeoTitle() {
		return seoTitle;
	}

	public void setSeoTitle(String seoTitle) {
		this.seoTitle = seoTitle;
	}


	public long getViewNum() {
		return viewNum;
	}

	public void setViewNum(long viewNum) {
		this.viewNum = viewNum;
	}


	public long getLikeNum() {
		return likeNum;
	}

	public void setLikeNum(long likeNum) {
		this.likeNum = likeNum;
	}


	public long getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(long commentNum) {
		this.commentNum = commentNum;
	}


	public long getLinkNum() {
		return linkNum;
	}

	public void setLinkNum(long linkNum) {
		this.linkNum = linkNum;
	}


	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}


	public long getEnrolmentNum() {
		return enrolmentNum;
	}

	public void setEnrolmentNum(long enrolmentNum) {
		this.enrolmentNum = enrolmentNum;
	}


	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}


	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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


	public long getProvince() {
		return province;
	}

	public void setProvince(long province) {
		this.province = province;
	}


	public long getCity() {
		return city;
	}

	public void setCity(long city) {
		this.city = city;
	}


	public long getArea() {
		return area;
	}

	public void setArea(long area) {
		this.area = area;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public String getLngLat() {
		return lngLat;
	}

	public void setLngLat(String lngLat) {
		this.lngLat = lngLat;
	}


	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}


	public long getSort() {
		return sort;
	}

	public void setSort(long sort) {
		this.sort = sort;
	}


	public Date getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}


	public String getCreatedId() {
		return createdId;
	}

	public void setCreatedId(String createdId) {
		this.createdId = createdId;
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
