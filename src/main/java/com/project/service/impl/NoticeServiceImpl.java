package com.project.service.impl;

import com.project.entity.vo.PaginationResultVO;
import com.project.entity.po.Notice;
import com.project.entity.query.NoticeQuery;
import com.project.mappers.NoticeMappers;
import com.project.service.NoticeService;
import com.project.entity.query.SimplePage;
import com.project.entity.enums.PageSize;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
/**
 * @Description:班级公告表Service
 * @author:null
 * @Date:2025/05/16
 */

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {

	@Resource
	private NoticeMappers<Notice,NoticeQuery> noticeMappers;
	/**
	 * According query select list
	 */
	@Override
	public List<Notice> findListByParam(NoticeQuery query) {
		return this.noticeMappers.selectList(query);
	}
	/**
	 * According query count list 
	 */
	@Override
	public Integer findCountByParam(NoticeQuery query) {
		return this.noticeMappers.selectCount(query);
	}
	/**
	 * query pagination list 
	 */
	@Override
	public PaginationResultVO<Notice> findListByPage(NoticeQuery query) {
		Integer count = this.findCountByParam(query);

		Integer pageSize = query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(), count, pageSize);
		query.setSimplePage(page);
		List<Notice> list = this.findListByParam(query);
		PaginationResultVO<Notice> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}


	/**
	 * add 
	 */
	@Override
	public Integer add(Notice bean) {
		return this.noticeMappers.insert(bean);
	}
	/**
	 * add batch 
	 */
	@Override
	public Integer addBatch(List<Notice> listBean) {
		if ( listBean == null || listBean.isEmpty() ) {;
			return 0;
		}
		return this.noticeMappers.insertBatch(listBean);
	}
	/**
	 * add or update batch 
	 */
	@Override
	public Integer addOrUpdateBatch(List<Notice> listBean) {
		if ( listBean == null || listBean.isEmpty() ) {;
			return 0;
		}
		return this.noticeMappers.insertOrUpdateBatch(listBean);
	}
	/**
	 * 根据Id查询
	 */
	@Override
	public Notice getNoticeById(Integer id) {
		return this.noticeMappers.selectById(id);
	}
	/**
	 * 根据Id更新
	 */
	@Override
	public Integer updateNoticeById(Notice bean, Integer id) {
		return this.noticeMappers.updateById(bean, id);
	}
	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteNoticeById(Integer id) {
		return this.noticeMappers.deleteById(id);
	}

}