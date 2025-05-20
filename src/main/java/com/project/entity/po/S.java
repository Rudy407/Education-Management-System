package com.project.entity.po;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.project.entity.enums.DateTimePatternEnum;
import com.project.utils.DateUtils;




/**
 * @Description:null
 * @author:null
 * @Date:2025/05/16
 */

public class S implements Serializable {
	/**
	 * 学号
	 */
	private String xh;

	/**
	 * 姓名
	 */
	private String xm;

	/**
	 * 性别
	 */
	private String xb;

	/**
	 * 籍贯
	 */
	private String jg;

	/**
	 * 手机号码
	 */
	private String sjhm;

	/**
	 * 院系号
	 */
	private String yxh;

	/**
	 * 状态
	 */
	private String zt;

	/**
	 * 出生日期
	 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone= "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date csrq;

	public void setXh (String xh) {
		this.xh = xh;
	}
	public String getXh () {
		return this.xh;
	}

	public void setXm (String xm) {
		this.xm = xm;
	}
	public String getXm () {
		return this.xm;
	}

	public void setXb (String xb) {
		this.xb = xb;
	}
	public String getXb () {
		return this.xb;
	}

	public void setJg (String jg) {
		this.jg = jg;
	}
	public String getJg () {
		return this.jg;
	}

	public void setSjhm (String sjhm) {
		this.sjhm = sjhm;
	}
	public String getSjhm () {
		return this.sjhm;
	}

	public void setYxh (String yxh) {
		this.yxh = yxh;
	}
	public String getYxh () {
		return this.yxh;
	}

	public void setZt (String zt) {
		this.zt = zt;
	}
	public String getZt () {
		return this.zt;
	}

	public void setCsrq (Date csrq) {
		this.csrq = csrq;
	}
	public Date getCsrq () {
		return this.csrq;
	}

	@Override
	public String toString() {
		return "学号: " + (xh == null ? "null" : xh)  + ", 姓名: " + (xm == null ? "null" : xm)  + ", 性别: " + (xb == null ? "null" : xb)  + ", 籍贯: " + (jg == null ? "null" : jg)  + ", 手机号码: " + (sjhm == null ? "null" : sjhm)  + ", 院系号: " + (yxh == null ? "null" : yxh)  + ", 状态: " + (zt == null ? "null" : zt)  + ", 出生日期: " + (csrq == null ? "null" : DateUtils.format(csrq, DateTimePatternEnum.YYYY_MM_DD.getPattern())) ;
	}
}