package com.project.entity.po;

import java.io.Serializable;




/**
 * @Description:null
 * @author:null
 * @Date:2025/05/16
 */

public class O implements Serializable {
	/**
	 * 学期
	 */
	private String xq;

	/**
	 * 课号
	 */
	private String kh;

	/**
	 * 工号
	 */
	private String gh;

	/**
	 * 上课时间
	 */
	private String sksj;

	public void setXq (String xq) {
		this.xq = xq;
	}
	public String getXq () {
		return this.xq;
	}

	public void setKh (String kh) {
		this.kh = kh;
	}
	public String getKh () {
		return this.kh;
	}

	public void setGh (String gh) {
		this.gh = gh;
	}
	public String getGh () {
		return this.gh;
	}

	public void setSksj (String sksj) {
		this.sksj = sksj;
	}
	public String getSksj () {
		return this.sksj;
	}

	@Override
	public String toString() {
		return "学期: " + (xq == null ? "null" : xq)  + ", 课号: " + (kh == null ? "null" : kh)  + ", 工号: " + (gh == null ? "null" : gh)  + ", 上课时间: " + (sksj == null ? "null" : sksj) ;
	}
}