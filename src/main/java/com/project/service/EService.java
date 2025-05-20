package com.project.service;

import com.project.entity.vo.PaginationResultVO;
import com.project.entity.po.E;
import com.project.entity.query.EQuery;

import java.util.List;
/**
 * @Description:nullService
 * @author:null
 * @Date:2025/05/16
 */

public interface EService {

	/**
	 * According query select list
	 */
	List<E> findListByParam(EQuery query);

	/**
	 * According query count list 
	 */
	Integer findCountByParam(EQuery query);

	/**
	 * query pagination list 
	 */
	PaginationResultVO<E> findListByPage(EQuery query);

	/**
	 * add 
	 */
	Integer add(E bean);

	/**
	 * add batch 
	 */
	Integer addBatch(List<E> listbean);

	/**
	 * add or update batch 
	 */
	Integer addOrUpdateBatch(List<E> listbean);

	/**
	 * 根据XhAndXqAndKhAndGh查询
	 */
	E getEByXhAndXqAndKhAndGh(String xh, String xq, String kh, String gh);

	/**
	 * 根据XhAndXqAndKhAndGh更新
	 */
	Integer updateEByXhAndXqAndKhAndGh(E bean, String xh, String xq, String kh, String gh);

	/**
	 * 根据XhAndXqAndKhAndGh删除
	 */
	Integer deleteEByXhAndXqAndKhAndGh(String xh, String xq, String kh, String gh);


}