package com.project.service;

import com.project.entity.vo.PaginationResultVO;
import com.project.entity.po.UserInfo;
import com.project.entity.query.UserInfoQuery;

import java.util.List;
/**
 * @Description:nullService
 * @author:null
 * @Date:2025/05/16
 */

public interface UserInfoService {

	/**
	 * According query select list
	 */
	List<UserInfo> findListByParam(UserInfoQuery query);

	/**
	 * According query count list 
	 */
	Integer findCountByParam(UserInfoQuery query);

	/**
	 * query pagination list 
	 */
	PaginationResultVO<UserInfo> findListByPage(UserInfoQuery query);

	/**
	 * add 
	 */
	Integer add(UserInfo bean);

	/**
	 * add batch 
	 */
	Integer addBatch(List<UserInfo> listbean);

	/**
	 * add or update batch 
	 */
	Integer addOrUpdateBatch(List<UserInfo> listbean);

	/**
	 * 根据Id查询
	 */
	UserInfo getUserInfoById(Integer id);

	/**
	 * 根据Id更新
	 */
	Integer updateUserInfoById(UserInfo bean, Integer id);

	/**
	 * 根据Id删除
	 */
	Integer deleteUserInfoById(Integer id);

	/**
	 * 根据Uid查询
	 */
	UserInfo getUserInfoByUid(String uid);

	/**
	 * 根据Uid更新
	 */
	Integer updateUserInfoByUid(UserInfo bean, String uid);

	/**
	 * 根据Uid删除
	 */
	Integer deleteUserInfoByUid(String uid);


}