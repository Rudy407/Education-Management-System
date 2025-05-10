package com.easyjava.entity.po;

import java.io.Serializable;




/**
 * @Description:null
 * @author:null
 * @Date:2025/05/09
 */

public class C implements Serializable {
	/**
	 * 
	 */
	private String kh;

	/**
	 * 
	 */
	private String km;

	/**
	 * 
	 */
	private Integer xf;

	/**
	 * 
	 */
	private Integer xs;

	/**
	 * 
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
		return "null: " + (kh == null ? "null" : kh)  + ", null: " + (km == null ? "null" : km)  + ", null: " + (xf == null ? "null" : xf)  + ", null: " + (xs == null ? "null" : xs)  + ", null: " + (yxh == null ? "null" : yxh) ;
	}
}