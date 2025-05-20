package com.project.service;

import com.project.entity.vo.PaginationResultVO;
import com.project.entity.po.S;
import com.project.entity.query.SQuery;

import java.util.List;
/**
 * @Description:nullService
 * @author:null
 * @Date:2025/05/16
 */

public interface SService {

	/**
	 * According query select list
	 */
	List<S> findListByParam(SQuery query);

	/**
	 * According query count list 
	 */
	Integer findCountByParam(SQuery query);

	/**
	 * query pagination list 
	 */
	PaginationResultVO<S> findListByPage(SQuery query);

	/**
	 * add 
	 */
	Integer add(S bean);

	/**
	 * add batch 
	 */
	Integer addBatch(List<S> listbean);

	/**
	 * add or update batch 
	 */
	Integer addOrUpdateBatch(List<S> listbean);

	/**
	 * 根据Xh查询
	 */
	S getSByXh(String xh);

	/**
	 * 根据Xh更新
	 */
	Integer updateSByXh(S bean, String xh);

	/**
	 * 根据Xh删除
	 */
	Integer deleteSByXh(String xh);


}