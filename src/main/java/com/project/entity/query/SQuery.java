package com.project.entity.query;

import java.util.Date;


/**
 * @Description:null query object
 * @author:null
 * @Date:2025/05/16
 */

public class SQuery extends BaseQuery {
	/**
	 * 学号
	 */
	private String xh;

	private String xhFuzzy;

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
	 * 籍贯
	 */
	private String jg;

	private String jgFuzzy;

	/**
	 * 手机号码
	 */
	private String sjhm;

	private String sjhmFuzzy;

	/**
	 * 院系号
	 */
	private String yxh;

	private String yxhFuzzy;

	/**
	 * 状态
	 */
	private String zt;

	private String ztFuzzy;

	/**
	 * 出生日期
	 */
	private Date csrq;

	private String csrqStart;

	private String csrqEnd;

	public void setXh(String xh) {
		this.xh = xh;
	}

	public String getXh() {
		return this.xh;
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

	public void setJg(String jg) {
		this.jg = jg;
	}

	public String getJg() {
		return this.jg;
	}

	public void setSjhm(String sjhm) {
		this.sjhm = sjhm;
	}

	public String getSjhm() {
		return this.sjhm;
	}

	public void setYxh(String yxh) {
		this.yxh = yxh;
	}

	public String getYxh() {
		return this.yxh;
	}

	public void setZt(String zt) {
		this.zt = zt;
	}

	public String getZt() {
		return this.zt;
	}

	public void setCsrq(Date csrq) {
		this.csrq = csrq;
	}

	public Date getCsrq() {
		return this.csrq;
	}

	public void setXhFuzzy(String xhFuzzy) {
		this.xhFuzzy = xhFuzzy;
	}

	public String getXhFuzzy() {
		return this.xhFuzzy;
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

	public void setJgFuzzy(String jgFuzzy) {
		this.jgFuzzy = jgFuzzy;
	}

	public String getJgFuzzy() {
		return this.jgFuzzy;
	}

	public void setSjhmFuzzy(String sjhmFuzzy) {
		this.sjhmFuzzy = sjhmFuzzy;
	}

	public String getSjhmFuzzy() {
		return this.sjhmFuzzy;
	}

	public void setYxhFuzzy(String yxhFuzzy) {
		this.yxhFuzzy = yxhFuzzy;
	}

	public String getYxhFuzzy() {
		return this.yxhFuzzy;
	}

	public void setZtFuzzy(String ztFuzzy) {
		this.ztFuzzy = ztFuzzy;
	}

	public String getZtFuzzy() {
		return this.ztFuzzy;
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

}