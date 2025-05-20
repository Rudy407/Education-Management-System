package com.project.service;

import com.project.entity.vo.PaginationResultVO;
import com.project.entity.po.D;
import com.project.entity.query.DQuery;

import java.util.List;
/**
 * @Description:nullService
 * @author:null
 * @Date:2025/05/16
 */

public interface DService {

	/**
	 * According query select list
	 */
	List<D> findListByParam(DQuery query);

	/**
	 * According query count list 
	 */
	Integer findCountByParam(DQuery query);

	/**
	 * query pagination list 
	 */
	PaginationResultVO<D> findListByPage(DQuery query);

	/**
	 * add 
	 */
	Integer add(D bean);

	/**
	 * add batch 
	 */
	Integer addBatch(List<D> listbean);

	/**
	 * add or update batch 
	 */
	Integer addOrUpdateBatch(List<D> listbean);

	/**
	 * 根据Yxh查询
	 */
	D getDByYxh(String yxh);

	/**
	 * 根据Yxh更新
	 */
	Integer updateDByYxh(D bean, String yxh);

	/**
	 * 根据Yxh删除
	 */
	Integer deleteDByYxh(String yxh);


}