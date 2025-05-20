package com.project.service.impl;

import com.project.entity.vo.PaginationResultVO;
import com.project.entity.po.O;
import com.project.entity.query.OQuery;
import com.project.mappers.OMappers;
import com.project.service.OService;
import com.project.entity.query.SimplePage;
import com.project.entity.enums.PageSize;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
/**
 * @Description:nullService
 * @author:null
 * @Date:2025/05/16
 */

@Service("oService")
public class OServiceImpl implements OService {

	@Resource
	private OMappers<O,OQuery> oMappers;
	/**
	 * According query select list
	 */
	@Override
	public List<O> findListByParam(OQuery query) {
		return this.oMappers.selectList(query);
	}
	/**
	 * According query count list 
	 */
	@Override
	public Integer findCountByParam(OQuery query) {
		return this.oMappers.selectCount(query);
	}
	/**
	 * query pagination list 
	 */
	@Override
	public PaginationResultVO<O> findListByPage(OQuery query) {
		Integer count = this.findCountByParam(query);

		Integer pageSize = query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(), count, pageSize);
		query.setSimplePage(page);
		List<O> list = this.findListByParam(query);
		PaginationResultVO<O> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}


	/**
	 * add 
	 */
	@Override
	public Integer add(O bean) {
		return this.oMappers.insert(bean);
	}
	/**
	 * add batch 
	 */
	@Override
	public Integer addBatch(List<O> listBean) {
		if ( listBean == null || listBean.isEmpty() ) {;
			return 0;
		}
		return this.oMappers.insertBatch(listBean);
	}
	/**
	 * add or update batch 
	 */
	@Override
	public Integer addOrUpdateBatch(List<O> listBean) {
		if ( listBean == null || listBean.isEmpty() ) {;
			return 0;
		}
		return this.oMappers.insertOrUpdateBatch(listBean);
	}
	/**
	 * 根据XqAndKhAndGh查询
	 */
	@Override
	public O getOByXqAndKhAndGh(String xq, String kh, String gh) {
		return this.oMappers.selectByXqAndKhAndGh(xq, kh, gh);
	}
	/**
	 * 根据XqAndKhAndGh更新
	 */
	@Override
	public Integer updateOByXqAndKhAndGh(O bean, String xq, String kh, String gh) {
		return this.oMappers.updateByXqAndKhAndGh(bean, xq, kh, gh);
	}
	/**
	 * 根据XqAndKhAndGh删除
	 */
	@Override
	public Integer deleteOByXqAndKhAndGh(String xq, String kh, String gh) {
		return this.oMappers.deleteByXqAndKhAndGh(xq, kh, gh);
	}

}