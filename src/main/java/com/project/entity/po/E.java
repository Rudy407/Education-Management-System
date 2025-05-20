package com.project.entity.po;

import java.io.Serializable;




/**
 * @Description:null
 * @author:null
 * @Date:2025/05/16
 */

public class E implements Serializable {
	/**
	 * 学号
	 */
	private String xh;

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
	 * 成绩
	 */
	private Integer cj;

	public void setXh (String xh) {
		this.xh = xh;
	}
	public String getXh () {
		return this.xh;
	}

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

	public void setCj (Integer cj) {
		this.cj = cj;
	}
	public Integer getCj () {
		return this.cj;
	}

	@Override
	public String toString() {
		return "学号: " + (xh == null ? "null" : xh)  + ", 学期: " + (xq == null ? "null" : xq)  + ", 课号: " + (kh == null ? "null" : kh)  + ", 工号: " + (gh == null ? "null" : gh)  + ", 成绩: " + (cj == null ? "null" : cj) ;
	}
}