package com.project.service.impl;

import com.project.entity.vo.PaginationResultVO;
import com.project.entity.po.UserInfo;
import com.project.entity.query.UserInfoQuery;
import com.project.entity.vo.ResponseVO;
import com.project.mappers.UserInfoMappers;
import com.project.service.UserInfoService;
import com.project.entity.query.SimplePage;
import com.project.entity.enums.PageSize;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
/**
 * @Description:nullService
 * @author:null
 * @Date:2025/05/16
 */

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

	@Resource
	private UserInfoMappers<UserInfo,UserInfoQuery> userInfoMappers;
	/**
	 * According query select list
	 */
	@Override
	public List<UserInfo> findListByParam(UserInfoQuery query) {
		return this.userInfoMappers.selectList(query);
	}
	/**
	 * According query count list 
	 */
	@Override
	public Integer findCountByParam(UserInfoQuery query) {
		return this.userInfoMappers.selectCount(query);
	}
	/**
	 * query pagination list 
	 */
	@Override
	public PaginationResultVO<UserInfo> findListByPage(UserInfoQuery query) {
		Integer count = this.findCountByParam(query);

		Integer pageSize = query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(), count, pageSize);
		query.setSimplePage(page);
		List<UserInfo> list = this.findListByParam(query);
		PaginationResultVO<UserInfo> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}


	/**
	 * add 
	 */
	@Override
	public Integer add(UserInfo bean) {
		return this.userInfoMappers.insert(bean);
	}
	/**
	 * add batch 
	 */
	@Override
	public Integer addBatch(List<UserInfo> listBean) {
		if ( listBean == null || listBean.isEmpty() ) {;
			return 0;
		}
		return this.userInfoMappers.insertBatch(listBean);
	}
	/**
	 * add or update batch 
	 */
	@Override
	public Integer addOrUpdateBatch(List<UserInfo> listBean) {
		if ( listBean == null || listBean.isEmpty() ) {;
			return 0;
		}
		return this.userInfoMappers.insertOrUpdateBatch(listBean);
	}
	/**
	 * 根据Id查询
	 */
	@Override
	public UserInfo getUserInfoById(Integer id) {
		return this.userInfoMappers.selectById(id);
	}
	/**
	 * 根据Id更新
	 */
	@Override
	public Integer updateUserInfoById(UserInfo bean, Integer id) {
		return this.userInfoMappers.updateById(bean, id);
	}
	/**
	 * 根据Id删除
	 */
	@Override
	public Integer deleteUserInfoById(Integer id) {
		return this.userInfoMappers.deleteById(id);
	}
	/**
	 * 根据Uid查询
	 */
	@Override
	public UserInfo getUserInfoByUid(String uid) {
		return this.userInfoMappers.selectByUid(uid);
	}
	/**
	 * 根据Uid更新
	 */
	@Override
	public Integer updateUserInfoByUid(UserInfo bean, String uid) {
		return this.userInfoMappers.updateByUid(bean, uid);
	}
	/**
	 * 根据Uid删除
	 */
	@Override
	public Integer deleteUserInfoByUid(String uid) {
		return this.userInfoMappers.deleteByUid(uid);
	}

}