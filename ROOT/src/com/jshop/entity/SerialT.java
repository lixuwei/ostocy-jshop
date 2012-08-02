package com.jshop.entity;

// Generated 2012-8-2 9:31:29 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * SerialT generated by hbm2java
 */
public class SerialT implements java.io.Serializable {

	private String biz;
	private String head;
	private String lastid;
	private int increment;
	private Date updatetime;

	public SerialT() {
	}

	public SerialT(String biz, String lastid, int increment, Date updatetime) {
		this.biz = biz;
		this.lastid = lastid;
		this.increment = increment;
		this.updatetime = updatetime;
	}

	public SerialT(String biz, String head, String lastid, int increment,
			Date updatetime) {
		this.biz = biz;
		this.head = head;
		this.lastid = lastid;
		this.increment = increment;
		this.updatetime = updatetime;
	}

	public String getBiz() {
		return this.biz;
	}

	public void setBiz(String biz) {
		this.biz = biz;
	}

	public String getHead() {
		return this.head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getLastid() {
		return this.lastid;
	}

	public void setLastid(String lastid) {
		this.lastid = lastid;
	}

	public int getIncrement() {
		return this.increment;
	}

	public void setIncrement(int increment) {
		this.increment = increment;
	}

	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

}
