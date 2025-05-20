package com.project.service.impl;

import com.project.entity.vo.PaginationResultVO;
import com.project.entity.po.D;
import com.project.entity.query.DQuery;
import com.project.mappers.DMappers;
import com.project.service.DService;
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

@Service("dService")
public class DServiceImpl implements DService {

	@Resource
	private DMappers<D,DQuery> dMappers;
	/**
	 * According query select list
	 */
	@Override
	public List<D> findListByParam(DQuery query) {
		return this.dMappers.selectList(query);
	}
	/**
	 * According query count list 
	 */
	@Override
	public Integer findCountByParam(DQuery query) {
		return this.dMappers.selectCount(query);
	}
	/**
	 * query pagination list 
	 */
	@Override
	public PaginationResultVO<D> findListByPage(DQuery query) {
		Integer count = this.findCountByParam(query);

		Integer pageSize = query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(), count, pageSize);
		query.setSimplePage(page);
		List<D> list = this.findListByParam(query);
		PaginationResultVO<D> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}


	/**
	 * add 
	 */
	@Override
	public Integer add(D bean) {
		return this.dMappers.insert(bean);
	}
	/**
	 * add batch 
	 */
	@Override
	public Integer addBatch(List<D> listBean) {
		if ( listBean == null || listBean.isEmpty() ) {;
			return 0;
		}
		return this.dMappers.insertBatch(listBean);
	}
	/**
	 * add or update batch 
	 */
	@Override
	public Integer addOrUpdateBatch(List<D> listBean) {
		if ( listBean == null || listBean.isEmpty() ) {;
			return 0;
		}
		return this.dMappers.insertOrUpdateBatch(listBean);
	}
	/**
	 * 根据Yxh查询
	 */
	@Override
	public D getDByYxh(String yxh) {
		return this.dMappers.selectByYxh(yxh);
	}
	/**
	 * 根据Yxh更新
	 */
	@Override
	public Integer updateDByYxh(D bean, String yxh) {
		return this.dMappers.updateByYxh(bean, yxh);
	}
	/**
	 * 根据Yxh删除
	 */
	@Override
	public Integer deleteDByYxh(String yxh) {
		return this.dMappers.deleteByYxh(yxh);
	}

}