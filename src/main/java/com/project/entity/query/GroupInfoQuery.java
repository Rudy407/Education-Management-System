package com.project.entity.query;

import java.util.Date;


/**
 * @Description:班级信息 query object
 * @author:null
 * @Date:2025/05/16
 */

public class GroupInfoQuery extends BaseQuery {
	/**
	 * 
	 */
	private Integer id;

	/**
	 * 班级ID
	 */
	private String groupId;

	private String groupIdFuzzy;

	/**
	 * 教师工号
	 */
	private String groupOwner;

	private String groupOwnerFuzzy;

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
	 * 班级状态
	 */
	private String status;

	private String statusFuzzy;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupOwner(String groupOwner) {
		this.groupOwner = groupOwner;
	}

	public String getGroupOwner() {
		return this.groupOwner;
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

	public void setGroupIdFuzzy(String groupIdFuzzy) {
		this.groupIdFuzzy = groupIdFuzzy;
	}

	public String getGroupIdFuzzy() {
		return this.groupIdFuzzy;
	}

	public void setGroupOwnerFuzzy(String groupOwnerFuzzy) {
		this.groupOwnerFuzzy = groupOwnerFuzzy;
	}

	public String getGroupOwnerFuzzy() {
		return this.groupOwnerFuzzy;
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