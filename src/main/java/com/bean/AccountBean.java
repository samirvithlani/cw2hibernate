package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class AccountBean {

	@Id
	@GeneratedValue
	private int id;

	private String acNo;
	private String acName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAcNo() {
		return acNo;
	}

	public void setAcNo(String acNo) {
		this.acNo = acNo;
	}

	public String getAcName() {
		return acName;
	}

	public void setAcName(String acName) {
		this.acName = acName;
	}

}
