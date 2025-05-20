package com.project.entity.po;

import java.io.Serializable;




/**
 * @Description:null
 * @author:null
 * @Date:2025/05/16
 */

public class C implements Serializable {
	/**
	 * 课号
	 */
	private String kh;

	/**
	 * 课名
	 */
	private String km;

	/**
	 * 学分
	 */
	private Integer xf;

	/**
	 * 学时
	 */
	private Integer xs;

	/**
	 * 院系号
	 */
	private String yxh;

	public void setKh (String kh) {
		this.kh = kh;
	}
	public String getKh () {
		return this.kh;
	}

	public void setKm (String km) {
		this.km = km;
	}
	public String getKm () {
		return this.km;
	}

	public void setXf (Integer xf) {
		this.xf = xf;
	}
	public Integer getXf () {
		return this.xf;
	}

	public void setXs (Integer xs) {
		this.xs = xs;
	}
	public Integer getXs () {
		return this.xs;
	}

	public void setYxh (String yxh) {
		this.yxh = yxh;
	}
	public String getYxh () {
		return this.yxh;
	}

	@Override
	public String toString() {
		return "课号: " + (kh == null ? "null" : kh)  + ", 课名: " + (km == null ? "null" : km)  + ", 学分: " + (xf == null ? "null" : xf)  + ", 学时: " + (xs == null ? "null" : xs)  + ", 院系号: " + (yxh == null ? "null" : yxh) ;
	}
}