package com.project.service.impl;

import com.project.entity.vo.PaginationResultVO;
import com.project.entity.po.S;
import com.project.entity.query.SQuery;
import com.project.mappers.SMappers;
import com.project.service.SService;
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

@Service("sService")
public class SServiceImpl implements SService {

	@Resource
	private SMappers<S,SQuery> sMappers;
	/**
	 * According query select list
	 */
	@Override
	public List<S> findListByParam(SQuery query) {
		return this.sMappers.selectList(query);
	}
	/**
	 * According query count list 
	 */
	@Override
	public Integer findCountByParam(SQuery query) {
		return this.sMappers.selectCount(query);
	}
	/**
	 * query pagination list 
	 */
	@Override
	public PaginationResultVO<S> findListByPage(SQuery query) {
		Integer count = this.findCountByParam(query);

		Integer pageSize = query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(), count, pageSize);
		query.setSimplePage(page);
		List<S> list = this.findListByParam(query);
		PaginationResultVO<S> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}


	/**
	 * add 
	 */
	@Override
	public Integer add(S bean) {
		return this.sMappers.insert(bean);
	}
	/**
	 * add batch 
	 */
	@Override
	public Integer addBatch(List<S> listBean) {
		if ( listBean == null || listBean.isEmpty() ) {;
			return 0;
		}
		return this.sMappers.insertBatch(listBean);
	}
	/**
	 * add or update batch 
	 */
	@Override
	public Integer addOrUpdateBatch(List<S> listBean) {
		if ( listBean == null || listBean.isEmpty() ) {;
			return 0;
		}
		return this.sMappers.insertOrUpdateBatch(listBean);
	}
	/**
	 * 根据Xh查询
	 */
	@Override
	public S getSByXh(String xh) {
		return this.sMappers.selectByXh(xh);
	}
	/**
	 * 根据Xh更新
	 */
	@Override
	public Integer updateSByXh(S bean, String xh) {
		return this.sMappers.updateByXh(bean, xh);
	}
	/**
	 * 根据Xh删除
	 */
	@Override
	public Integer deleteSByXh(String xh) {
		return this.sMappers.deleteByXh(xh);
	}

}