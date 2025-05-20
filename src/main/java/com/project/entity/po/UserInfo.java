package com.project.entity.po;

import java.io.Serializable;




/**
 * @Description:null
 * @author:null
 * @Date:2025/05/16
 */

public class UserInfo implements Serializable {
	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	private String uid;

	/**
	 * 
	 */
	private String password;

	/**
	 * 
	 */
	private String userGroup;

	/**
	 * 
	 */
	private String code;

	/**
	 * 
	 */
	private String userName;

	public void setId (Integer id) {
		this.id = id;
	}
	public Integer getId () {
		return this.id;
	}

	public void setUid (String uid) {
		this.uid = uid;
	}
	public String getUid () {
		return this.uid;
	}

	public void setPassword (String password) {
		this.password = password;
	}
	public String getPassword () {
		return this.password;
	}

	public void setUserGroup (String userGroup) {
		this.userGroup = userGroup;
	}
	public String getUserGroup () {
		return this.userGroup;
	}

	public void setCode (String code) {
		this.code = code;
	}
	public String getCode () {
		return this.code;
	}

	public void setUserName (String userName) {
		this.userName = userName;
	}
	public String getUserName () {
		return this.userName;
	}

	@Override
	public String toString() {
		return "null: " + (id == null ? "null" : id)  + ", null: " + (uid == null ? "null" : uid)  + ", null: " + (password == null ? "null" : password)  + ", null: " + (userGroup == null ? "null" : userGroup)  + ", null: " + (code == null ? "null" : code)  + ", null: " + (userName == null ? "null" : userName) ;
	}
}