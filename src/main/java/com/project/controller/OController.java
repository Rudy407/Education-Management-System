package com.project.controller;

import com.project.entity.po.O;
import com.project.entity.query.OQuery;
import com.project.entity.vo.ResponseVO;
import com.project.service.OService;
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
@RequestMapping("/o")
public class OController extends ABaseController {

	@Resource
	private OService oService;

	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(OQuery query) {
		return getSuccessResponseVO(oService.findListByPage(query));
	}
	/**
	 * add 
	 */
	@RequestMapping("add")
	public ResponseVO add(O bean) {
		return getSuccessResponseVO(oService.add(bean));
	}
	/**
	 * add batch 
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<O> listBean) {
		return getSuccessResponseVO(oService.addBatch(listBean));
	}
	/**
	 * add or update batch 
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<O> listBean) {
		return getSuccessResponseVO(oService.addOrUpdateBatch(listBean));
	}
	/**
	 * 根据XqAndKhAndGh查询
	 */
	@RequestMapping("getOByXqAndKhAndGh")
	public ResponseVO getOByXqAndKhAndGh(String xq, String kh, String gh) {
		return getSuccessResponseVO(oService.getOByXqAndKhAndGh(xq, kh, gh));
	}
	/**
	 * 根据XqAndKhAndGh更新
	 */
	@RequestMapping("updateOByXqAndKhAndGh")
	public ResponseVO updateOByXqAndKhAndGh(O bean, String xq, String kh, String gh) {
		return getSuccessResponseVO(oService.updateOByXqAndKhAndGh(bean, xq, kh, gh));
	}
	/**
	 * 根据XqAndKhAndGh删除
	 */
	@RequestMapping("deleteOByXqAndKhAndGh")
	public ResponseVO deleteOByXqAndKhAndGh(String xq, String kh, String gh) {
		return getSuccessResponseVO(oService.deleteOByXqAndKhAndGh(xq, kh, gh));
	}

}