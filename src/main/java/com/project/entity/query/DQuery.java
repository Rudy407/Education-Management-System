package com.project.entity.query;



/**
 * @Description:null query object
 * @author:null
 * @Date:2025/05/16
 */

public class DQuery extends BaseQuery {
	/**
	 * 
	 */
	private String yxh;

	private String yxhFuzzy;

	/**
	 * 名称
	 */
	private String mc;

	private String mcFuzzy;

	/**
	 * 地址
	 */
	private String dz;

	private String dzFuzzy;

	/**
	 * 联系电话
	 */
	private String lxdh;

	private String lxdhFuzzy;

	public void setYxh(String yxh) {
		this.yxh = yxh;
	}

	public String getYxh() {
		return this.yxh;
	}

	public void setMc(String mc) {
		this.mc = mc;
	}

	public String getMc() {
		return this.mc;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}

	public String getDz() {
		return this.dz;
	}

	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}

	public String getLxdh() {
		return this.lxdh;
	}

	public void setYxhFuzzy(String yxhFuzzy) {
		this.yxhFuzzy = yxhFuzzy;
	}

	public String getYxhFuzzy() {
		return this.yxhFuzzy;
	}

	public void setMcFuzzy(String mcFuzzy) {
		this.mcFuzzy = mcFuzzy;
	}

	public String getMcFuzzy() {
		return this.mcFuzzy;
	}

	public void setDzFuzzy(String dzFuzzy) {
		this.dzFuzzy = dzFuzzy;
	}

	public String getDzFuzzy() {
		return this.dzFuzzy;
	}

	public void setLxdhFuzzy(String lxdhFuzzy) {
		this.lxdhFuzzy = lxdhFuzzy;
	}

	public String getLxdhFuzzy() {
		return this.lxdhFuzzy;
	}

}