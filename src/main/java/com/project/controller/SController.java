package com.project.controller;

import com.project.entity.po.S;
import com.project.entity.query.SQuery;
import com.project.entity.vo.ResponseVO;
import com.project.service.SService;
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
@RequestMapping("/s")
public class SController extends ABaseController {

	@Resource
	private SService sService;

	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(SQuery query) {
		return getSuccessResponseVO(sService.findListByPage(query));
	}
	/**
	 * add 
	 */
	@RequestMapping("add")
	public ResponseVO add(S bean) {
		return getSuccessResponseVO(sService.add(bean));
	}
	/**
	 * add batch 
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<S> listBean) {
		return getSuccessResponseVO(sService.addBatch(listBean));
	}
	/**
	 * add or update batch 
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<S> listBean) {
		return getSuccessResponseVO(sService.addOrUpdateBatch(listBean));
	}
	/**
	 * 根据Xh查询
	 */
	@RequestMapping("getSByXh")
	public ResponseVO getSByXh(String xh) {
		return getSuccessResponseVO(sService.getSByXh(xh));
	}
	/**
	 * 根据Xh更新
	 */
	@RequestMapping("updateSByXh")
	public ResponseVO updateSByXh(S bean, String xh) {
		return getSuccessResponseVO(sService.updateSByXh(bean, xh));
	}
	/**
	 * 根据Xh删除
	 */
	@RequestMapping("deleteSByXh")
	public ResponseVO deleteSByXh(String xh) {
		return getSuccessResponseVO(sService.deleteSByXh(xh));
	}

}