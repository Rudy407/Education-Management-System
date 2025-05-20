package com.project.entity.po;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.project.entity.enums.DateTimePatternEnum;
import com.project.utils.DateUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * @Description:班级公告表
 * @author:null
 * @Date:2025/05/16
 */

public class Notice implements Serializable {
	/**
	 * 
	 */
	private Integer id;

	/**
	 * 公告标题
	 */
	private String title;

	/**
	 * 班级ID
	 */
	private String groupId;

	/**
	 * 公告内容
	 */
	private String noticeContent;

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
	 * 
	 */
	@JsonIgnore
	private String status;

	public void setId (Integer id) {
		this.id = id;
	}
	public Integer getId () {
		return this.id;
	}

	public void setTitle (String title) {
		this.title = title;
	}
	public String getTitle () {
		return this.title;
	}

	public void setGroupId (String groupId) {
		this.groupId = groupId;
	}
	public String getGroupId () {
		return this.groupId;
	}

	public void setNoticeContent (String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public String getNoticeContent () {
		return this.noticeContent;
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
		return "null: " + (id == null ? "null" : id)  + ", 公告标题: " + (title == null ? "null" : title)  + ", 班级ID: " + (groupId == null ? "null" : groupId)  + ", 公告内容: " + (noticeContent == null ? "null" : noticeContent)  + ", null: " + (createTime == null ? "null" : DateUtils.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))  + ", null: " + (updateTime == null ? "null" : DateUtils.format(updateTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))  + ", null: " + (status == null ? "null" : status) ;
	}
}