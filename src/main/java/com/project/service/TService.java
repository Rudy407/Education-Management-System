package com.project.service;

import com.project.entity.vo.PaginationResultVO;
import com.project.entity.po.T;
import com.project.entity.query.TQuery;

import java.util.List;
/**
 * @Description:nullService
 * @author:null
 * @Date:2025/05/16
 */

public interface TService {

	/**
	 * According query select list
	 */
	List<T> findListByParam(TQuery query);

	/**
	 * According query count list 
	 */
	Integer findCountByParam(TQuery query);

	/**
	 * query pagination list 
	 */
	PaginationResultVO<T> findListByPage(TQuery query);

	/**
	 * add 
	 */
	Integer add(T bean);

	/**
	 * add batch 
	 */
	Integer addBatch(List<T> listbean);

	/**
	 * add or update batch 
	 */
	Integer addOrUpdateBatch(List<T> listbean);

	/**
	 * 根据Gh查询
	 */
	T getTByGh(String gh);

	/**
	 * 根据Gh更新
	 */
	Integer updateTByGh(T bean, String gh);

	/**
	 * 根据Gh删除
	 */
	Integer deleteTByGh(String gh);


}