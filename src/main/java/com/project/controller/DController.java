package com.project.controller;

import com.project.entity.po.D;
import com.project.entity.query.DQuery;
import com.project.entity.vo.ResponseVO;
import com.project.service.DService;
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
@RequestMapping("/d")
public class DController extends ABaseController {

	@Resource
	private DService dService;

	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(DQuery query) {
		return getSuccessResponseVO(dService.findListByPage(query));
	}
	/**
	 * add 
	 */
	@RequestMapping("add")
	public ResponseVO add(D bean) {
		return getSuccessResponseVO(dService.add(bean));
	}
	/**
	 * add batch 
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<D> listBean) {
		return getSuccessResponseVO(dService.addBatch(listBean));
	}
	/**
	 * add or update batch 
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<D> listBean) {
		return getSuccessResponseVO(dService.addOrUpdateBatch(listBean));
	}
	/**
	 * 根据Yxh查询
	 */
	@RequestMapping("getDByYxh")
	public ResponseVO getDByYxh(String yxh) {
		return getSuccessResponseVO(dService.getDByYxh(yxh));
	}
	/**
	 * 根据Yxh更新
	 */
	@RequestMapping("updateDByYxh")
	public ResponseVO updateDByYxh(D bean, String yxh) {
		return getSuccessResponseVO(dService.updateDByYxh(bean, yxh));
	}
	/**
	 * 根据Yxh删除
	 */
	@RequestMapping("deleteDByYxh")
	public ResponseVO deleteDByYxh(String yxh) {
		return getSuccessResponseVO(dService.deleteDByYxh(yxh));
	}

}