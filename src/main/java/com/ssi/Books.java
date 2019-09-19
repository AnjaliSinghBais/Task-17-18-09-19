package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books {
	@Id
	private int bcode;
	private String bname;
	private int price;

	public int getBcode() {
		return bcode;
	}

	public void setBcode(int bcode) {
		this.bcode = bcode;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
