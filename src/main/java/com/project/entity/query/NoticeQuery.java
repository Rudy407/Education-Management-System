package com.project.entity.query;

import java.util.Date;


/**
 * @Description:班级公告表 query object
 * @author:null
 * @Date:2025/05/16
 */

public class NoticeQuery extends BaseQuery {
	/**
	 * 
	 */
	private Integer id;

	/**
	 * 公告标题
	 */
	private String title;

	private String titleFuzzy;

	/**
	 * 班级ID
	 */
	private String groupId;

	private String groupIdFuzzy;

	/**
	 * 公告内容
	 */
	private String noticeContent;

	private String noticeContentFuzzy;

	/**
	 * 
	 */
	private Date createTime;

	private String createTimeStart;

	private String createTimeEnd;

	/**
	 * 
	 */
	private Date updateTime;

	private String updateTimeStart;

	private String updateTimeEnd;

	/**
	 * 
	 */
	private String status;

	private String statusFuzzy;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public String getNoticeContent() {
		return this.noticeContent;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return this.status;
	}

	public void setTitleFuzzy(String titleFuzzy) {
		this.titleFuzzy = titleFuzzy;
	}

	public String getTitleFuzzy() {
		return this.titleFuzzy;
	}

	public void setGroupIdFuzzy(String groupIdFuzzy) {
		this.groupIdFuzzy = groupIdFuzzy;
	}

	public String getGroupIdFuzzy() {
		return this.groupIdFuzzy;
	}

	public void setNoticeContentFuzzy(String noticeContentFuzzy) {
		this.noticeContentFuzzy = noticeContentFuzzy;
	}

	public String getNoticeContentFuzzy() {
		return this.noticeContentFuzzy;
	}

	public void setCreateTimeStart(String createTimeStart) {
		this.createTimeStart = createTimeStart;
	}

	public String getCreateTimeStart() {
		return this.createTimeStart;
	}

	public void setCreateTimeEnd(String createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}

	public String getCreateTimeEnd() {
		return this.createTimeEnd;
	}

	public void setUpdateTimeStart(String updateTimeStart) {
		this.updateTimeStart = updateTimeStart;
	}

	public String getUpdateTimeStart() {
		return this.updateTimeStart;
	}

	public void setUpdateTimeEnd(String updateTimeEnd) {
		this.updateTimeEnd = updateTimeEnd;
	}

	public String getUpdateTimeEnd() {
		return this.updateTimeEnd;
	}

	public void setStatusFuzzy(String statusFuzzy) {
		this.statusFuzzy = statusFuzzy;
	}

	public String getStatusFuzzy() {
		return this.statusFuzzy;
	}

}