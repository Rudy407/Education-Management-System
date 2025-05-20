package com.project.controller;

import com.project.entity.po.T;
import com.project.entity.query.TQuery;
import com.project.entity.vo.ResponseVO;
import com.project.service.TService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;
/**
 * @Description:nullController
 * @author:null
 * @Date:2025/05/16
 */

@RestController
@RequestMapping("/t")
public class TController extends ABaseController {

	@Resource
	private TService tService;

	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(TQuery query) {
		return getSuccessResponseVO(tService.findListByPage(query));
	}
	/**
	 * add 
	 */
	@RequestMapping("add")
	public ResponseVO add(T bean) {
		return getSuccessResponseVO(tService.add(bean));
	}
	/**
	 * add batch 
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<T> listBean) {
		return getSuccessResponseVO(tService.addBatch(listBean));
	}
	/**
	 * add or update batch 
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<T> listBean) {
		return getSuccessResponseVO(tService.addOrUpdateBatch(listBean));
	}
	/**
	 * 根据Gh查询
	 */
	@RequestMapping("getTByGh")
	public ResponseVO getTByGh(String gh) {
		return getSuccessResponseVO(tService.getTByGh(gh));
	}
	/**
	 * 根据Gh更新
	 */
	@RequestMapping("updateTByGh")
	public ResponseVO updateTByGh(T bean, String gh) {
		return getSuccessResponseVO(tService.updateTByGh(bean, gh));
	}
	/**
	 * 根据Gh删除
	 */
	@RequestMapping("deleteTByGh")
	public ResponseVO deleteTByGh(String gh) {
		return getSuccessResponseVO(tService.deleteTByGh(gh));
	}

}