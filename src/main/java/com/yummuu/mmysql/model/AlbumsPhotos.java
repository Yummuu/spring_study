package com.yummuu.mmysql.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "albums_photos")
public class AlbumsPhotos implements Serializable{
	@Id
	@Column(name = "album_id")
	private long albumId;

	@Column(name = "photo_id")
	private long photoId;



	public long getAlbumId() {
		return albumId;
	}

	public void setAlbumId(long albumId) {
		this.albumId = albumId;
	}


	public long getPhotoId() {
		return photoId;
	}

	public void setPhotoId(long photoId) {
		this.photoId = photoId;
	}

}
