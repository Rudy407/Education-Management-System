package com.project.entity.query;



/**
 * @Description:null query object
 * @author:null
 * @Date:2025/05/16
 */

public class UserInfoQuery extends BaseQuery {
	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	private String uid;

	private String uidFuzzy;

	/**
	 * 
	 */
	private String password;

	private String passwordFuzzy;

	/**
	 * 
	 */
	private String userGroup;

	private String userGroupFuzzy;

	/**
	 * 
	 */
	private String code;

	private String codeFuzzy;

	/**
	 * 
	 */
	private String userName;

	private String userNameFuzzy;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUid() {
		return this.uid;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	public void setUserGroup(String userGroup) {
		this.userGroup = userGroup;
	}

	public String getUserGroup() {
		return this.userGroup;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUidFuzzy(String uidFuzzy) {
		this.uidFuzzy = uidFuzzy;
	}

	public String getUidFuzzy() {
		return this.uidFuzzy;
	}

	public void setPasswordFuzzy(String passwordFuzzy) {
		this.passwordFuzzy = passwordFuzzy;
	}

	public String getPasswordFuzzy() {
		return this.passwordFuzzy;
	}

	public void setUserGroupFuzzy(String userGroupFuzzy) {
		this.userGroupFuzzy = userGroupFuzzy;
	}

	public String getUserGroupFuzzy() {
		return this.userGroupFuzzy;
	}

	public void setCodeFuzzy(String codeFuzzy) {
		this.codeFuzzy = codeFuzzy;
	}

	public String getCodeFuzzy() {
		return this.codeFuzzy;
	}

	public void setUserNameFuzzy(String userNameFuzzy) {
		this.userNameFuzzy = userNameFuzzy;
	}

	public String getUserNameFuzzy() {
		return this.userNameFuzzy;
	}

}