package com.project.entity.query;



/**
 * @Description:null query object
 * @author:null
 * @Date:2025/05/16
 */

public class CQuery extends BaseQuery {
	/**
	 * 课号
	 */
	private String kh;

	private String khFuzzy;

	/**
	 * 课名
	 */
	private String km;

	private String kmFuzzy;

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

	private String yxhFuzzy;

	public void setKh(String kh) {
		this.kh = kh;
	}

	public String getKh() {
		return this.kh;
	}

	public void setKm(String km) {
		this.km = km;
	}

	public String getKm() {
		return this.km;
	}

	public void setXf(Integer xf) {
		this.xf = xf;
	}

	public Integer getXf() {
		return this.xf;
	}

	public void setXs(Integer xs) {
		this.xs = xs;
	}

	public Integer getXs() {
		return this.xs;
	}

	public void setYxh(String yxh) {
		this.yxh = yxh;
	}

	public String getYxh() {
		return this.yxh;
	}

	public void setKhFuzzy(String khFuzzy) {
		this.khFuzzy = khFuzzy;
	}

	public String getKhFuzzy() {
		return this.khFuzzy;
	}

	public void setKmFuzzy(String kmFuzzy) {
		this.kmFuzzy = kmFuzzy;
	}

	public String getKmFuzzy() {
		return this.kmFuzzy;
	}

	public void setYxhFuzzy(String yxhFuzzy) {
		this.yxhFuzzy = yxhFuzzy;
	}

	public String getYxhFuzzy() {
		return this.yxhFuzzy;
	}

}