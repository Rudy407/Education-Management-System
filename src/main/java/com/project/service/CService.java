package com.project.service;

import com.project.entity.vo.PaginationResultVO;
import com.project.entity.po.C;
import com.project.entity.query.CQuery;

import java.util.List;
/**
 * @Description:nullService
 * @author:null
 * @Date:2025/05/16
 */

public interface CService {

	/**
	 * According query select list
	 */
	List<C> findListByParam(CQuery query);

	/**
	 * According query count list 
	 */
	Integer findCountByParam(CQuery query);

	/**
	 * query pagination list 
	 */
	PaginationResultVO<C> findListByPage(CQuery query);

	/**
	 * add 
	 */
	Integer add(C bean);

	/**
	 * add batch 
	 */
	Integer addBatch(List<C> listbean);

	/**
	 * add or update batch 
	 */
	Integer addOrUpdateBatch(List<C> listbean);

	/**
	 * 根据Kh查询
	 */
	C getCByKh(String kh);

	/**
	 * 根据Kh更新
	 */
	Integer updateCByKh(C bean, String kh);

	/**
	 * 根据Kh删除
	 */
	Integer deleteCByKh(String kh);


}