package com.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "subcription")
public class SubscriptionBean {

	@Id
	@GeneratedValue
	private int subId;
	private String subName;

	@ManyToMany(cascade = { CascadeType.ALL })
	private List<ReaderBean> readers;

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public List<ReaderBean> getReaders() {
		return readers;
	}

	public void setReaders(List<ReaderBean> readers) {
		this.readers = readers;
	}

}
