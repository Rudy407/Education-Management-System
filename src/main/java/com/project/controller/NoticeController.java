package com.project.controller;

import com.project.entity.po.Notice;
import com.project.entity.query.NoticeQuery;
import com.project.entity.vo.ResponseVO;
import com.project.service.NoticeService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;
/**
 * @Description:班级公告表Controller
 * @author:null
 * @Date:2025/05/16
 */

@RestController
@RequestMapping("/notice")
public class NoticeController extends ABaseController {

	@Resource
	private NoticeService noticeService;

	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(NoticeQuery query) {
		return getSuccessResponseVO(noticeService.findListByPage(query));
	}
	/**
	 * add 
	 */
	@RequestMapping("add")
	public ResponseVO add(Notice bean) {
		return getSuccessResponseVO(noticeService.add(bean));
	}
	/**
	 * add batch 
	 */
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<Notice> listBean) {
		return getSuccessResponseVO(noticeService.addBatch(listBean));
	}
	/**
	 * add or update batch 
	 */
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<Notice> listBean) {
		return getSuccessResponseVO(noticeService.addOrUpdateBatch(listBean));
	}
	/**
	 * 根据Id查询
	 */
	@RequestMapping("getNoticeById")
	public ResponseVO getNoticeById(Integer id) {
		return getSuccessResponseVO(noticeService.getNoticeById(id));
	}
	/**
	 * 根据Id更新
	 */
	@RequestMapping("updateNoticeById")
	public ResponseVO updateNoticeById(Notice bean, Integer id) {
		return getSuccessResponseVO(noticeService.updateNoticeById(bean, id));
	}
	/**
	 * 根据Id删除
	 */
	@RequestMapping("deleteNoticeById")
	public ResponseVO deleteNoticeById(Integer id) {
		return getSuccessResponseVO(noticeService.deleteNoticeById(id));
	}

}