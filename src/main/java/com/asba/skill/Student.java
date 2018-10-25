package com.asba.skill;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {

	@Id
	private int bid;
	private int cid;
	private String date;
	private int amt;
	private String payMode;
	private String plan;
	
	public Student(int bid, int cid, String date, int amt, String payMode, String plan) {
		super();
		this.bid = bid;
		this.cid = cid;
		this.date = date;
		this.amt = amt;
		this.payMode = payMode;
		this.plan = plan;
	}
	public int getBid() {
		return bid;
	}
	public int getCid() {
		return cid;
	}
	public String getDate() {
		return date;
	}
	public int getAmt() {
		return amt;
	}
	public String getPayMode() {
		return payMode;
	}
	public String getPlan() {
		return plan;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	

	
	

}
