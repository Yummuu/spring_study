package com.yummuu.mmysql.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "config_email")
public class ConfigEmail implements Serializable{
	@Id
	@Column(name = "mail_driver")
	private String mailDriver;

	@Column(name = "mail_host")
	private String mailHost;

	@Column(name = "mail_port")
	private String mailPort;

	@Column(name = "mail_username")
	private String mailUsername;

	@Column(name = "mail_password")
	private String mailPassword;

	@Column(name = "mail_encryption")
	private String mailEncryption;

	@Column(name = "mail_from_address")
	private String mailFromAddress;

	@Column(name = "mail_from_name")
	private String mailFromName;



	public String getMailDriver() {
		return mailDriver;
	}

	public void setMailDriver(String mailDriver) {
		this.mailDriver = mailDriver;
	}


	public String getMailHost() {
		return mailHost;
	}

	public void setMailHost(String mailHost) {
		this.mailHost = mailHost;
	}


	public String getMailPort() {
		return mailPort;
	}

	public void setMailPort(String mailPort) {
		this.mailPort = mailPort;
	}


	public String getMailUsername() {
		return mailUsername;
	}

	public void setMailUsername(String mailUsername) {
		this.mailUsername = mailUsername;
	}


	public String getMailPassword() {
		return mailPassword;
	}

	public void setMailPassword(String mailPassword) {
		this.mailPassword = mailPassword;
	}


	public String getMailEncryption() {
		return mailEncryption;
	}

	public void setMailEncryption(String mailEncryption) {
		this.mailEncryption = mailEncryption;
	}


	public String getMailFromAddress() {
		return mailFromAddress;
	}

	public void setMailFromAddress(String mailFromAddress) {
		this.mailFromAddress = mailFromAddress;
	}


	public String getMailFromName() {
		return mailFromName;
	}

	public void setMailFromName(String mailFromName) {
		this.mailFromName = mailFromName;
	}

}
