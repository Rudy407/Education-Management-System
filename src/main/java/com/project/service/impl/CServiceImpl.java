package com.project.service.impl;

import com.project.entity.vo.PaginationResultVO;
import com.project.entity.po.C;
import com.project.entity.query.CQuery;
import com.project.mappers.CMappers;
import com.project.service.CService;
import com.project.entity.query.SimplePage;
import com.project.entity.enums.PageSize;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
/**
 * @Description:nullService
 * @author:null
 * @Date:2025/05/12
 */

@Service("cService")
public class CServiceImpl implements CService {

	@Resource
	private CMappers<C,CQuery> cMappers;
	/**
	 * According query select list
	 */
	@Override
	public List<C> findListByParam(CQuery query) {
		return this.cMappers.selectList(query);
	}
	/**
	 * According query count list 
	 */
	@Override
	public Integer findCountByParam(CQuery query) {
		return this.cMappers.selectCount(query);
	}
	/**
	 * query pagination list 
	 */
	@Override
	public PaginationResultVO<C> findListByPage(CQuery query) {
		Integer count = this.findCountByParam(query);

		Integer pageSize = query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(), count, pageSize);
		query.setSimplePage(page);
		List<C> list = this.findListByParam(query);
		PaginationResultVO<C> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}


	/**
	 * add 
	 */
	@Override
	public Integer add(C bean) {
		return this.cMappers.insert(bean);
	}
	/**
	 * add batch 
	 */
	@Override
	public Integer addBatch(List<C> listBean) {
		if ( listBean == null || listBean.isEmpty() ) {;
			return 0;
		}
		return this.cMappers.insertBatch(listBean);
	}
	/**
	 * add or update batch 
	 */
	@Override
	public Integer addOrUpdateBatch(List<C> listBean) {
		if ( listBean == null || listBean.isEmpty() ) {;
			return 0;
		}
		return this.cMappers.insertOrUpdateBatch(listBean);
	}
	/**
	 * 根据Kh查询
	 */
	@Override
	public C getCByKh(String kh) {
		return this.cMappers.selectByKh(kh);
	}
	/**
	 * 根据Kh更新
	 */
	@Override
	public Integer updateCByKh(C bean, String kh) {
		return this.cMappers.updateByKh(bean, kh);
	}
	/**
	 * 根据Kh删除
	 */
	@Override
	public Integer deleteCByKh(String kh) {
		return this.cMappers.deleteByKh(kh);
	}

}