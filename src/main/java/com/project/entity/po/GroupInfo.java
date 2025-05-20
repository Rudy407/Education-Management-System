package com.project.entity.po;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.project.entity.enums.DateTimePatternEnum;
import com.project.utils.DateUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * @Description:班级信息
 * @author:null
 * @Date:2025/05/16
 */

public class GroupInfo implements Serializable {
	/**
	 * 
	 */
	private Integer id;

	/**
	 * 班级ID
	 */
	private String groupId;

	/**
	 * 教师工号
	 */
	private String groupOwner;

	/**
	 * 学期
	 */
	private String xq;

	/**
	 * 课号
	 */
	private String kh;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone= "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone= "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	/**
	 * 班级状态
	 */
	@JsonIgnore
	private String status;

	public void setId (Integer id) {
		this.id = id;
	}
	public Integer getId () {
		return this.id;
	}

	public void setGroupId (String groupId) {
		this.groupId = groupId;
	}
	public String getGroupId () {
		return this.groupId;
	}

	public void setGroupOwner (String groupOwner) {
		this.groupOwner = groupOwner;
	}
	public String getGroupOwner () {
		return this.groupOwner;
	}

	public void setXq (String xq) {
		this.xq = xq;
	}
	public String getXq () {
		return this.xq;
	}

	public void setKh (String kh) {
		this.kh = kh;
	}
	public String getKh () {
		return this.kh;
	}

	public void setCreateTime (Date createTime) {
		this.createTime = createTime;
	}
	public Date getCreateTime () {
		return this.createTime;
	}

	public void setUpdateTime (Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getUpdateTime () {
		return this.updateTime;
	}

	public void setStatus (String status) {
		this.status = status;
	}
	public String getStatus () {
		return this.status;
	}

	@Override
	public String toString() {
		return "null: " + (id == null ? "null" : id)  + ", 班级ID: " + (groupId == null ? "null" : groupId)  + ", 教师工号: " + (groupOwner == null ? "null" : groupOwner)  + ", 学期: " + (xq == null ? "null" : xq)  + ", 课号: " + (kh == null ? "null" : kh)  + ", null: " + (createTime == null ? "null" : DateUtils.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))  + ", null: " + (updateTime == null ? "null" : DateUtils.format(updateTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))  + ", 班级状态: " + (status == null ? "null" : status) ;
	}
}