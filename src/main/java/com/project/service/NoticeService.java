package com.project.service;

import com.project.entity.vo.PaginationResultVO;
import com.project.entity.po.Notice;
import com.project.entity.query.NoticeQuery;

import java.util.List;
/**
 * @Description:班级公告表Service
 * @author:null
 * @Date:2025/05/16
 */

public interface NoticeService {

	/**
	 * According query select list
	 */
	List<Notice> findListByParam(NoticeQuery query);

	/**
	 * According query count list 
	 */
	Integer findCountByParam(NoticeQuery query);

	/**
	 * query pagination list 
	 */
	PaginationResultVO<Notice> findListByPage(NoticeQuery query);

	/**
	 * add 
	 */
	Integer add(Notice bean);

	/**
	 * add batch 
	 */
	Integer addBatch(List<Notice> listbean);

	/**
	 * add or update batch 
	 */
	Integer addOrUpdateBatch(List<Notice> listbean);

	/**
	 * 根据Id查询
	 */
	Notice getNoticeById(Integer id);

	/**
	 * 根据Id更新
	 */
	Integer updateNoticeById(Notice bean, Integer id);

	/**
	 * 根据Id删除
	 */
	Integer deleteNoticeById(Integer id);


}