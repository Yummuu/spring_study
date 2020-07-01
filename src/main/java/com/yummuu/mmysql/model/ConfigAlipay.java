package com.yummuu.mmysql.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "config_alipay")
public class ConfigAlipay implements Serializable{
	@Id
	@Column(name = "app_id")
	private String appId;

	@Column(name = "rsa_private_key")
	private String rsaPrivateKey;

	@Column(name = "rsa_public_key")
	private String rsaPublicKey;

	@Column(name = "partner_public_key")
	private String partnerPublicKey;



	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}


	public String getRsaPrivateKey() {
		return rsaPrivateKey;
	}

	public void setRsaPrivateKey(String rsaPrivateKey) {
		this.rsaPrivateKey = rsaPrivateKey;
	}


	public String getRsaPublicKey() {
		return rsaPublicKey;
	}

	public void setRsaPublicKey(String rsaPublicKey) {
		this.rsaPublicKey = rsaPublicKey;
	}


	public String getPartnerPublicKey() {
		return partnerPublicKey;
	}

	public void setPartnerPublicKey(String partnerPublicKey) {
		this.partnerPublicKey = partnerPublicKey;
	}

}
