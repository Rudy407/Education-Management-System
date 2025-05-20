package com.project.service.impl;

import com.project.entity.vo.PaginationResultVO;
import com.project.entity.po.GroupInfo;
import com.project.entity.query.GroupInfoQuery;
import com.project.mappers.GroupInfoMappers;
import com.project.service.GroupInfoService;
import com.project.entity.query.SimplePage;
import com.project.entity.enums.PageSize;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
/**
 * @Description:班级信息Service
 * @author:null
 * @Date:2025/05/16
 */

@Service("groupInfoService")
public class GroupInfoServiceImpl implements GroupInfoService {

	@Resource
	private GroupInfoMappers<GroupInfo,GroupInfoQuery> groupInfoMappers;
	/**
	 * According query select list
	 */
	@Override
	public List<GroupInfo> findListByParam(GroupInfoQuery query) {
		return this.groupInfoMappers.selectList(query);
	}
	/**
	 * According query count list 
	 */
	@Override
	public Integer findCountByParam(GroupInfoQuery query) {
		return this.groupInfoMappers.selectCount(query);
	}
	/**
	 * query pagination list 
	 */
	@Override
	public PaginationResultVO<GroupInfo> findListByPage(GroupInfoQuery query) {
		Integer count = this.findCountByParam(query);

		Integer pageSize = query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(), count, pageSize);
		query.setSimplePage(page);
		List<GroupInfo> list = this.findListByParam(query);
		PaginationResultVO<GroupInfo> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}


	/**
	 * add 
	 */
	@Override
	public Integer add(GroupInfo bean) {
		return this.groupInfoMappers.insert(bean);
	}
	/**
	 * add batch 
	 */
	@Override
	public Integer addBatch(List<GroupInfo> listBean) {
		if ( listBean == null || listBean.isEmpty() ) {;
			return 0;
		}
		return this.groupInfoMappers.insertBatch(listBean);
	}
	/**
	 * add or update batch 
	 */
	@Override
	public Integer addOrUpdateBatch(List<GroupInfo> listBean) {
		if ( listBean == null || listBean.isEmpty() ) {;
			return 0;
		}
		return this.groupInfoMappers.insertOrUpdateBatch(listBean);
	}
	/**
	 * 根据GroupId查询
	 */
	@Override
	public GroupInfo getGroupInfoByGroupId(String groupId) {
		return this.groupInfoMappers.selectByGroupId(groupId);
	}
	/**
	 * 根据GroupId更新
	 */
	@Override
	public Integer updateGroupInfoByGroupId(GroupInfo bean, String groupId) {
		return this.groupInfoMappers.updateByGroupId(bean, groupId);
	}
	/**
	 * 根据GroupId删除
	 */
	@Override
	public Integer deleteGroupInfoByGroupId(String groupId) {
		return this.groupInfoMappers.deleteByGroupId(groupId);
	}
	/**
	 * 根据Id查询
	 */
	@Override
	public GroupInfo getGroupInfoById(Integer id) {
		return this.groupInfoMappers.selectById(id);
	}
	/**
	 * 根据Id更新
	 */
	@Override
	public Integer updateGroupInfoById(GroupInfo bean, Integer id) {
		return this.groupInfoMappers.updateById(bean, id);
	}
	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteGroupInfoById(Integer id) {
		return this.groupInfoMappers.deleteById(id);
	}

}