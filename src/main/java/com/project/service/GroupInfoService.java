package com.project.service;

import com.project.entity.vo.PaginationResultVO;
import com.project.entity.po.GroupInfo;
import com.project.entity.query.GroupInfoQuery;

import java.util.List;
/**
 * @Description:班级信息Service
 * @author:null
 * @Date:2025/05/16
 */

public interface GroupInfoService {

	/**
	 * According query select list
	 */
	List<GroupInfo> findListByParam(GroupInfoQuery query);

	/**
	 * According query count list 
	 */
	Integer findCountByParam(GroupInfoQuery query);

	/**
	 * query pagination list 
	 */
	PaginationResultVO<GroupInfo> findListByPage(GroupInfoQuery query);

	/**
	 * add 
	 */
	Integer add(GroupInfo bean);

	/**
	 * add batch 
	 */
	Integer addBatch(List<GroupInfo> listbean);

	/**
	 * add or update batch 
	 */
	Integer addOrUpdateBatch(List<GroupInfo> listbean);

	/**
	 * 根据GroupId查询
	 */
	GroupInfo getGroupInfoByGroupId(String groupId);

	/**
	 * 根据GroupId更新
	 */
	Integer updateGroupInfoByGroupId(GroupInfo bean, String groupId);

	/**
	 * 根据GroupId删除
	 */
	Integer deleteGroupInfoByGroupId(String groupId);

	/**
	 * 根据Id查询
	 */
	GroupInfo getGroupInfoById(Integer id);

	/**
	 * 根据Id更新
	 */
	Integer updateGroupInfoById(GroupInfo bean, Integer id);

	/**
	 * 根据Id删除
	 */
	Integer deleteGroupInfoById(Integer id);


}