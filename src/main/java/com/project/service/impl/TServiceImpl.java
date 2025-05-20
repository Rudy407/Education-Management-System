package com.project.service.impl;

import com.project.entity.vo.PaginationResultVO;
import com.project.entity.po.T;
import com.project.entity.query.TQuery;
import com.project.mappers.TMappers;
import com.project.service.TService;
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

@Service("tService")
public class TServiceImpl implements TService {

	@Resource
	private TMappers<T,TQuery> tMappers;
	/**
	 * According query select list
	 */
	@Override
	public List<T> findListByParam(TQuery query) {
		return this.tMappers.selectList(query);
	}
	/**
	 * According query count list 
	 */
	@Override
	public Integer findCountByParam(TQuery query) {
		return this.tMappers.selectCount(query);
	}
	/**
	 * query pagination list 
	 */
	@Override
	public PaginationResultVO<T> findListByPage(TQuery query) {
		Integer count = this.findCountByParam(query);

		Integer pageSize = query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(), count, pageSize);
		query.setSimplePage(page);
		List<T> list = this.findListByParam(query);
		PaginationResultVO<T> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}


	/**
	 * add 
	 */
	@Override
	public Integer add(T bean) {
		return this.tMappers.insert(bean);
	}
	/**
	 * add batch 
	 */
	@Override
	public Integer addBatch(List<T> listBean) {
		if ( listBean == null || listBean.isEmpty() ) {;
			return 0;
		}
		return this.tMappers.insertBatch(listBean);
	}
	/**
	 * add or update batch 
	 */
	@Override
	public Integer addOrUpdateBatch(List<T> listBean) {
		if ( listBean == null || listBean.isEmpty() ) {;
			return 0;
		}
		return this.tMappers.insertOrUpdateBatch(listBean);
	}
	/**
	 * 根据Gh查询
	 */
	@Override
	public T getTByGh(String gh) {
		return this.tMappers.selectByGh(gh);
	}
	/**
	 * 根据Gh更新
	 */
	@Override
	public Integer updateTByGh(T bean, String gh) {
		return this.tMappers.updateByGh(bean, gh);
	}
	/**
	 * 根据Gh删除
	 */
	@Override
	public Integer deleteTByGh(String gh) {
		return this.tMappers.deleteByGh(gh);
	}

}