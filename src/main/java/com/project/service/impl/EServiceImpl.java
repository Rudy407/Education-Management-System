package com.project.service.impl;

import com.project.entity.vo.PaginationResultVO;
import com.project.entity.po.E;
import com.project.entity.query.EQuery;
import com.project.mappers.EMappers;
import com.project.service.EService;
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

@Service("eService")
public class EServiceImpl implements EService {

	@Resource
	private EMappers<E,EQuery> eMappers;
	/**
	 * According query select list
	 */
	@Override
	public List<E> findListByParam(EQuery query) {
		return this.eMappers.selectList(query);
	}
	/**
	 * According query count list 
	 */
	@Override
	public Integer findCountByParam(EQuery query) {
		return this.eMappers.selectCount(query);
	}
	/**
	 * query pagination list 
	 */
	@Override
	public PaginationResultVO<E> findListByPage(EQuery query) {
		Integer count = this.findCountByParam(query);

		Integer pageSize = query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(), count, pageSize);
		query.setSimplePage(page);
		List<E> list = this.findListByParam(query);
		PaginationResultVO<E> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}


	/**
	 * add 
	 */
	@Override
	public Integer add(E bean) {
		return this.eMappers.insert(bean);
	}
	/**
	 * add batch 
	 */
	@Override
	public Integer addBatch(List<E> listBean) {
		if ( listBean == null || listBean.isEmpty() ) {;
			return 0;
		}
		return this.eMappers.insertBatch(listBean);
	}
	/**
	 * add or update batch 
	 */
	@Override
	public Integer addOrUpdateBatch(List<E> listBean) {
		if ( listBean == null || listBean.isEmpty() ) {;
			return 0;
		}
		return this.eMappers.insertOrUpdateBatch(listBean);
	}
	/**
	 * 根据XhAndXqAndKhAndGh查询
	 */
	@Override
	public E getEByXhAndXqAndKhAndGh(String xh, String xq, String kh, String gh) {
		return this.eMappers.selectByXhAndXqAndKhAndGh(xh, xq, kh, gh);
	}
	/**
	 * 根据XhAndXqAndKhAndGh更新
	 */
	@Override
	public Integer updateEByXhAndXqAndKhAndGh(E bean, String xh, String xq, String kh, String gh) {
		return this.eMappers.updateByXhAndXqAndKhAndGh(bean, xh, xq, kh, gh);
	}
	/**
	 * 根据XhAndXqAndKhAndGh删除
	 */
	@Override
	public Integer deleteEByXhAndXqAndKhAndGh(String xh, String xq, String kh, String gh) {
		return this.eMappers.deleteByXhAndXqAndKhAndGh(xh, xq, kh, gh);
	}

}