package com.project.controller;

import com.project.entity.po.E;
import com.project.entity.query.EQuery;
import com.project.entity.vo.ResponseVO;
import com.project.service.EService;
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
@RequestMapping("/e")
public class EController extends ABaseController {

	@Resource
	private EService eService;

	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(EQuery query) {
		return getSuccessResponseVO(eService.findListByPage(query));
	}
	/**
	 * add 
	 */
	@RequestMapping("add")
	public ResponseVO add(E bean) {
		return getSuccessResponseVO(eService.add(bean));
	}
	/**
	 * add batch 
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<E> listBean) {
		return getSuccessResponseVO(eService.addBatch(listBean));
	}
	/**
	 * add or update batch 
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<E> listBean) {
		return getSuccessResponseVO(eService.addOrUpdateBatch(listBean));
	}
	/**
	 * 根据XhAndXqAndKhAndGh查询
	 */
	@RequestMapping("getEByXhAndXqAndKhAndGh")
	public ResponseVO getEByXhAndXqAndKhAndGh(String xh, String xq, String kh, String gh) {
		return getSuccessResponseVO(eService.getEByXhAndXqAndKhAndGh(xh, xq, kh, gh));
	}
	/**
	 * 根据XhAndXqAndKhAndGh更新
	 */
	@RequestMapping("updateEByXhAndXqAndKhAndGh")
	public ResponseVO updateEByXhAndXqAndKhAndGh(E bean, String xh, String xq, String kh, String gh) {
		return getSuccessResponseVO(eService.updateEByXhAndXqAndKhAndGh(bean, xh, xq, kh, gh));
	}
	/**
	 * 根据XhAndXqAndKhAndGh删除
	 */
	@RequestMapping("deleteEByXhAndXqAndKhAndGh")
	public ResponseVO deleteEByXhAndXqAndKhAndGh(String xh, String xq, String kh, String gh) {
		return getSuccessResponseVO(eService.deleteEByXhAndXqAndKhAndGh(xh, xq, kh, gh));
	}

}