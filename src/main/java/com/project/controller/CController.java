package com.project.controller;

import com.project.entity.po.C;
import com.project.entity.query.CQuery;
import com.project.entity.vo.ResponseVO;
import com.project.service.CService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;
/**
 * @Description:nullController
 * @author:null
 * @Date:2025/05/12
 */

@RestController
@RequestMapping("/c")
public class CController extends ABaseController {

	@Resource
	private CService cService;

	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(CQuery query) {
		return getSuccessResponseVO(cService.findListByPage(query));
	}
	/**
	 * add 
	 */
	@RequestMapping("add")
	public ResponseVO add(C bean) {
		this.cService.add(bean);
		return getSuccessResponseVO(null);
	}
	/**
	 * add batch 
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<C> listBean) {
		this.cService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}
	/**
	 * add or update batch 
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<C> listBean) {
		this.cService.addOrUpdateBatch(listBean);
		return getSuccessResponseVO(null);
	}
	/**
	 * 根据Kh查询
	 */
	@RequestMapping("getCByKh")
	public ResponseVO getCByKh(String kh) {
		this.cService.getCByKh(kh);
		return getSuccessResponseVO(null);
	}
	/**
	 * 根据Kh更新
	 */
	@RequestMapping("updateCByKh")
	public ResponseVO updateCByKh(C bean, String kh) {
		this.cService.updateCByKh(bean, kh);
		return getSuccessResponseVO(null);
	}
	/**
	 * 根据Kh删除
	 */
	@RequestMapping("deleteCByKh")
	public ResponseVO deleteCByKh(String kh) {
		this.cService.deleteCByKh(kh);
		return getSuccessResponseVO(null);
	}

}