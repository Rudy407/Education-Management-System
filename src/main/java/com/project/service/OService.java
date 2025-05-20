package com.project.service;

import com.project.entity.vo.PaginationResultVO;
import com.project.entity.po.O;
import com.project.entity.query.OQuery;

import java.util.List;
/**
 * @Description:nullService
 * @author:null
 * @Date:2025/05/16
 */

public interface OService {

	/**
	 * According query select list
	 */
	List<O> findListByParam(OQuery query);

	/**
	 * According query count list 
	 */
	Integer findCountByParam(OQuery query);

	/**
	 * query pagination list 
	 */
	PaginationResultVO<O> findListByPage(OQuery query);

	/**
	 * add 
	 */
	Integer add(O bean);

	/**
	 * add batch 
	 */
	Integer addBatch(List<O> listbean);

	/**
	 * add or update batch 
	 */
	Integer addOrUpdateBatch(List<O> listbean);

	/**
	 * 根据XqAndKhAndGh查询
	 */
	O getOByXqAndKhAndGh(String xq, String kh, String gh);

	/**
	 * 根据XqAndKhAndGh更新
	 */
	Integer updateOByXqAndKhAndGh(O bean, String xq, String kh, String gh);

	/**
	 * 根据XqAndKhAndGh删除
	 */
	Integer deleteOByXqAndKhAndGh(String xq, String kh, String gh);


}