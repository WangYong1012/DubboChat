package com.brave.entity.user;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "mc_guanzhu")
public class McUserCareEntity implements Serializable
{
	@Id
	@GeneratedValue
	private int id;

	private int gzid;

	private String gzaccount;

	private int gztype;

	private int bgzid;

	private String bgzaccount;

	private int bgztype;

	private Date createtime;

	private int sfgz;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGzid() {
		return gzid;
	}

	public void setGzid(int gzid) {
		this.gzid = gzid;
	}

	public String getGzaccount() {
		return gzaccount;
	}

	public void setGzaccount(String gzaccount) {
		this.gzaccount = gzaccount == null ? "" : gzaccount.trim();
	}

	public int getGztype() {
		return gztype;
	}

	public void setGztype(int gztype) {
		this.gztype = gztype;
	}

	public int getBgzid() {
		return bgzid;
	}

	public void setBgzid(int bgzid) {
		this.bgzid = bgzid;
	}

	public String getBgzaccount() {
		return bgzaccount;
	}

	public void setBgzaccount(String bgzaccount) {
		this.bgzaccount = bgzaccount == null ? "" : bgzaccount.trim();
	}

	public int getBgztype() {
		return bgztype;
	}

	public void setBgztype(int bgztype) {
		this.bgztype = bgztype;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public int getSfgz() {
		return sfgz;
	}

	public void setSfgz(int sfgz) {
		this.sfgz = sfgz;
	}
}