package com.project.controller;

import com.project.entity.vo.ResponseVO;
import com.project.entity.po.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/c")
public class CController extends ABaseController{

	@Autowired
	private CService cService;
//
//	@RequestMapping("/loadBeautyAccountList")
//	public ResponseVO loadBeautyAccountList(@RequestBody C c) {
//		return getSuccessResponseVO(cService.insert(c));
//	}

	@GetMapping("/kh={kh}")
	public C get(@PathVariable String kh) {
		return cService.getBykh(kh);
	}

	@GetMapping("/list")
	public List<C> list() {
		return cService.getAll();
	}
}
