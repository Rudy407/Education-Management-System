package com.project.controller;

import com.project.entity.po.GroupInfo;
import com.project.entity.query.GroupInfoQuery;
import com.project.entity.vo.ResponseVO;
import com.project.service.GroupInfoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;
/**
 * @Description:班级信息Controller
 * @author:null
 * @Date:2025/05/16
 */

@RestController
@RequestMapping("/groupInfo")
public class GroupInfoController extends ABaseController {

	@Resource
	private GroupInfoService groupInfoService;

	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(GroupInfoQuery query) {
		return getSuccessResponseVO(groupInfoService.findListByPage(query));
	}
	/**
	 * add 
	 */
	@RequestMapping("add")
	public ResponseVO add(GroupInfo bean) {
		return getSuccessResponseVO(groupInfoService.add(bean));
	}
	/**
	 * add batch 
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<GroupInfo> listBean) {
		return getSuccessResponseVO(groupInfoService.addBatch(listBean));
	}
	/**
	 * add or update batch 
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<GroupInfo> listBean) {
		return getSuccessResponseVO(groupInfoService.addOrUpdateBatch(listBean));
	}
	/**
	 * 根据GroupId查询
	 */
	@RequestMapping("getGroupInfoByGroupId")
	public ResponseVO getGroupInfoByGroupId(String groupId) {
		return getSuccessResponseVO(groupInfoService.getGroupInfoByGroupId(groupId));
	}
	/**
	 * 根据GroupId更新
	 */
	@RequestMapping("updateGroupInfoByGroupId")
	public ResponseVO updateGroupInfoByGroupId(GroupInfo bean, String groupId) {
		return getSuccessResponseVO(groupInfoService.updateGroupInfoByGroupId(bean, groupId));
	}
	/**
	 * 根据GroupId删除
	 */
	@RequestMapping("deleteGroupInfoByGroupId")
	public ResponseVO deleteGroupInfoByGroupId(String groupId) {
		return getSuccessResponseVO(groupInfoService.deleteGroupInfoByGroupId(groupId));
	}
	/**
	 * 根据Id查询
	 */
	@RequestMapping("getGroupInfoById")
	public ResponseVO getGroupInfoById(Integer id) {
		return getSuccessResponseVO(groupInfoService.getGroupInfoById(id));
	}
	/**
	 * 根据Id更新
	 */
	@RequestMapping("updateGroupInfoById")
	public ResponseVO updateGroupInfoById(GroupInfo bean, Integer id) {
		return getSuccessResponseVO(groupInfoService.updateGroupInfoById(bean, id));
	}
	/**
	 * 根据Id删除
	 */
	@RequestMapping("deleteGroupInfoById")
	public ResponseVO deleteGroupInfoById(Integer id) {
		return getSuccessResponseVO(groupInfoService.deleteGroupInfoById(id));
	}

}