package com.project.entity.query;



/**
 * @Description:null query object
 * @author:null
 * @Date:2025/05/16
 */

public class EQuery extends BaseQuery {
	/**
	 * 学号
	 */
	private String xh;

	private String xhFuzzy;

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
	 * 成绩
	 */
	private Integer cj;

	public void setXh(String xh) {
		this.xh = xh;
	}

	public String getXh() {
		return this.xh;
	}

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

	public void setCj(Integer cj) {
		this.cj = cj;
	}

	public Integer getCj() {
		return this.cj;
	}

	public void setXhFuzzy(String xhFuzzy) {
		this.xhFuzzy = xhFuzzy;
	}

	public String getXhFuzzy() {
		return this.xhFuzzy;
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

}