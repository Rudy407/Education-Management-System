package com.project.entity.query;

import java.util.Date;


/**
 * @Description:null query object
 * @author:null
 * @Date:2025/05/16
 */

public class TQuery extends BaseQuery {
	/**
	 * 工号
	 */
	private String gh;

	private String ghFuzzy;

	/**
	 * 姓名
	 */
	private String xm;

	private String xmFuzzy;

	/**
	 * 性别
	 */
	private String xb;

	private String xbFuzzy;

	/**
	 * 出生日期
	 */
	private Date csrq;

	private String csrqStart;

	private String csrqEnd;

	/**
	 * 职称
	 */
	private String zc;

	private String zcFuzzy;

	/**
	 * 院系号
	 */
	private String yxh;

	private String yxhFuzzy;

	public void setGh(String gh) {
		this.gh = gh;
	}

	public String getGh() {
		return this.gh;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getXm() {
		return this.xm;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public String getXb() {
		return this.xb;
	}

	public void setCsrq(Date csrq) {
		this.csrq = csrq;
	}

	public Date getCsrq() {
		return this.csrq;
	}

	public void setZc(String zc) {
		this.zc = zc;
	}

	public String getZc() {
		return this.zc;
	}

	public void setYxh(String yxh) {
		this.yxh = yxh;
	}

	public String getYxh() {
		return this.yxh;
	}

	public void setGhFuzzy(String ghFuzzy) {
		this.ghFuzzy = ghFuzzy;
	}

	public String getGhFuzzy() {
		return this.ghFuzzy;
	}

	public void setXmFuzzy(String xmFuzzy) {
		this.xmFuzzy = xmFuzzy;
	}

	public String getXmFuzzy() {
		return this.xmFuzzy;
	}

	public void setXbFuzzy(String xbFuzzy) {
		this.xbFuzzy = xbFuzzy;
	}

	public String getXbFuzzy() {
		return this.xbFuzzy;
	}

	public void setCsrqStart(String csrqStart) {
		this.csrqStart = csrqStart;
	}

	public String getCsrqStart() {
		return this.csrqStart;
	}

	public void setCsrqEnd(String csrqEnd) {
		this.csrqEnd = csrqEnd;
	}

	public String getCsrqEnd() {
		return this.csrqEnd;
	}

	public void setZcFuzzy(String zcFuzzy) {
		this.zcFuzzy = zcFuzzy;
	}

	public String getZcFuzzy() {
		return this.zcFuzzy;
	}

	public void setYxhFuzzy(String yxhFuzzy) {
		this.yxhFuzzy = yxhFuzzy;
	}

	public String getYxhFuzzy() {
		return this.yxhFuzzy;
	}

}