package com.project.entity.query;



/**
 * @Description:null query object
 * @author:null
 * @Date:2025/05/16
 */

public class OQuery extends BaseQuery {
	/**
	 * 学期
	 */
	private String xq;

	private String xqFuzzy;

	/**
	 * 课号
	 */
	private String kh;

	private String khFuzzy;

	/**
	 * 工号
	 */
	private String gh;

	private String ghFuzzy;

	/**
	 * 上课时间
	 */
	private String sksj;

	private String sksjFuzzy;

	public void setXq(String xq) {
		this.xq = xq;
	}

	public String getXq() {
		return this.xq;
	}

	public void setKh(String kh) {
		this.kh = kh;
	}

	public String getKh() {
		return this.kh;
	}

	public void setGh(String gh) {
		this.gh = gh;
	}

	public String getGh() {
		return this.gh;
	}

	public void setSksj(String sksj) {
		this.sksj = sksj;
	}

	public String getSksj() {
		return this.sksj;
	}

	public void setXqFuzzy(String xqFuzzy) {
		this.xqFuzzy = xqFuzzy;
	}

	public String getXqFuzzy() {
		return this.xqFuzzy;
	}

	public void setKhFuzzy(String khFuzzy) {
		this.khFuzzy = khFuzzy;
	}

	public String getKhFuzzy() {
		return this.khFuzzy;
	}

	public void setGhFuzzy(String ghFuzzy) {
		this.ghFuzzy = ghFuzzy;
	}

	public String getGhFuzzy() {
		return this.ghFuzzy;
	}

	public void setSksjFuzzy(String sksjFuzzy) {
		this.sksjFuzzy = sksjFuzzy;
	}

	public String getSksjFuzzy() {
		return this.sksjFuzzy;
	}

}