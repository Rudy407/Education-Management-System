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

public class T implements Serializable {
	/**
	 * 工号
	 */
	private String gh;

	/**
	 * 姓名
	 */
	private String xm;

	/**
	 * 性别
	 */
	private String xb;

	/**
	 * 出生日期
	 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone= "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date csrq;

	/**
	 * 职称
	 */
	private String zc;

	/**
	 * 院系号
	 */
	private String yxh;

	public void setGh (String gh) {
		this.gh = gh;
	}
	public String getGh () {
		return this.gh;
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

	public void setCsrq (Date csrq) {
		this.csrq = csrq;
	}
	public Date getCsrq () {
		return this.csrq;
	}

	public void setZc (String zc) {
		this.zc = zc;
	}
	public String getZc () {
		return this.zc;
	}

	public void setYxh (String yxh) {
		this.yxh = yxh;
	}
	public String getYxh () {
		return this.yxh;
	}

	@Override
	public String toString() {
		return "工号: " + (gh == null ? "null" : gh)  + ", 姓名: " + (xm == null ? "null" : xm)  + ", 性别: " + (xb == null ? "null" : xb)  + ", 出生日期: " + (csrq == null ? "null" : DateUtils.format(csrq, DateTimePatternEnum.YYYY_MM_DD.getPattern()))  + ", 职称: " + (zc == null ? "null" : zc)  + ", 院系号: " + (yxh == null ? "null" : yxh) ;
	}
}