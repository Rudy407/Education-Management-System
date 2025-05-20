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
 * @Date:2025/05/16
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

	@RequestMapping("updateCourse")
	public ResponseVO updateCourse(@RequestBody C c) {
		return getSuccessResponseVO(cService.updateCByKh(c,c.getKh()));
	}
	@RequestMapping("deleteCourse")
	public ResponseVO deleteCourse(@RequestBody C c) {
		return getSuccessResponseVO(cService.deleteCByKh(c.getKh()));
	}

	/**
	 * add 
	 */
	@RequestMapping("add")
	public ResponseVO add(@RequestBody C bean) {
		return getSuccessResponseVO(cService.add(bean));
	}
	/**
	 * add batch 
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<C> listBean) {
		return getSuccessResponseVO(cService.addBatch(listBean));
	}
	/**
	 * add or update batch 
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<C> listBean) {
		return getSuccessResponseVO(cService.addOrUpdateBatch(listBean));
	}
	/**
	 * 根据Kh查询
	 */
	@RequestMapping("getCByKh")
	public ResponseVO getCByKh(String kh) {
		return getSuccessResponseVO(cService.getCByKh(kh));
	}
	/**
	 * 根据Kh更新
	 */
	@RequestMapping("updateCByKh")
	public ResponseVO updateCByKh(C bean, String kh) {
		return getSuccessResponseVO(cService.updateCByKh(bean, kh));
	}
	/**
	 * 根据Kh删除
	 */
	@RequestMapping("deleteCByKh")
	public ResponseVO deleteCByKh(String kh) {
		return getSuccessResponseVO(cService.deleteCByKh(kh));
	}

}