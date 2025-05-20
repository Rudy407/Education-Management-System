package com.project.entity.po;

import java.io.Serializable;




/**
 * @Description:null
 * @author:null
 * @Date:2025/05/16
 */

public class D implements Serializable {
	/**
	 * 
	 */
	private String yxh;

	/**
	 * 名称
	 */
	private String mc;

	/**
	 * 地址
	 */
	private String dz;

	/**
	 * 联系电话
	 */
	private String lxdh;

	public void setYxh (String yxh) {
		this.yxh = yxh;
	}
	public String getYxh () {
		return this.yxh;
	}

	public void setMc (String mc) {
		this.mc = mc;
	}
	public String getMc () {
		return this.mc;
	}

	public void setDz (String dz) {
		this.dz = dz;
	}
	public String getDz () {
		return this.dz;
	}

	public void setLxdh (String lxdh) {
		this.lxdh = lxdh;
	}
	public String getLxdh () {
		return this.lxdh;
	}

	@Override
	public String toString() {
		return "null: " + (yxh == null ? "null" : yxh)  + ", 名称: " + (mc == null ? "null" : mc)  + ", 地址: " + (dz == null ? "null" : dz)  + ", 联系电话: " + (lxdh == null ? "null" : lxdh) ;
	}
}