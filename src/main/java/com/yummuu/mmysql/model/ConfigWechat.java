package com.yummuu.mmysql.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "config_wechat")
public class ConfigWechat implements Serializable{
	@Id
	@Column(name = "app_id")
	private String appId;

	@Column(name = "merchant_id")
	private String merchantId;

	@Column(name = "notify_url")
	private String notifyUrl;

	@Column(name = "key")
	private String key;

	@Column(name = "app_secret")
	private String appSecret;

	@Column(name = "ssl_cert_path")
	private String sslCertPath;

	@Column(name = "ssl_key_path")
	private String sslKeyPath;



	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}


	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}


	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}


	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}


	public String getAppSecret() {
		return appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}


	public String getSslCertPath() {
		return sslCertPath;
	}

	public void setSslCertPath(String sslCertPath) {
		this.sslCertPath = sslCertPath;
	}


	public String getSslKeyPath() {
		return sslKeyPath;
	}

	public void setSslKeyPath(String sslKeyPath) {
		this.sslKeyPath = sslKeyPath;
	}

}
