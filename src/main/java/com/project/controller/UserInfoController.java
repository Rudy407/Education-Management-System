package com.project.controller;

import com.project.entity.dto.LoginRequest;
import com.project.entity.po.UserInfo;
import com.project.entity.query.UserInfoQuery;
import com.project.entity.vo.ResponseVO;
import com.project.entity.dto.RegisterRequest;
import com.project.service.UserInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

import static com.project.utils.StringUtils.randomUID;

/**
 * @Description:nullController
 * @author:null
 * @Date:2025/05/16
 */

@RestController
@RequestMapping("/userInfo")
public class UserInfoController extends ABaseController {

	@Resource
	private UserInfoService userInfoService;

	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(UserInfoQuery query) {
		return getSuccessResponseVO(userInfoService.findListByPage(query));
	}


	public Integer getUserInfoByUserName(String userName) {
		UserInfoQuery query = new UserInfoQuery();
		query.setUserName(userName);
		return userInfoService.findCountByParam (query);

	}
	@PostMapping("register")
	public ResponseVO UserInforegister(@RequestBody RegisterRequest request) {
		String userName = request.getUserName();
		String password = request.getPassword();
		String usergroup = request.getUsergroup();
		String usercode = request.getUsercode();
		if(StringUtils.length(userName) < 4 || StringUtils.length(userName) > 20){
//			return getServerErrorResponseVO("userName length error");
			int len = (userName == null) ? 0 : userName.length();
			return getServerErrorResponseVO("userName length error (length: " + len + ")");

		};
		if(StringUtils.length(password) < 4 || StringUtils.length(password) > 20){
			return getServerErrorResponseVO("password length error");
		}
		if(getUserInfoByUserName(userName)>0 ){
			return getServerErrorResponseVO("账号已注册");
		}
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName(userName);
		userInfo.setPassword(password);
		userInfo.setUid(randomUID(16));
		userInfo.setUserGroup(usergroup);
		userInfo.setCode(usercode);

		return getSuccessResponseVO(userInfoService.add(userInfo));
	}


	@RequestMapping("login")
	public ResponseVO UserInfologin(@RequestBody LoginRequest request) {
		String userName = request.getUserName();
		String password = request.getPassword();
		UserInfoQuery query = new UserInfoQuery();
		query.setUserName(userName);
		if(userInfoService.findCountByParam(query) == 0){
			return getServerErrorResponseVO("userName error");
		}
		query.setPassword(password);
		if( userInfoService.findCountByParam (query) == 0){
			return getServerErrorResponseVO("password error");
		}else{
			return getSuccessResponseVO("checked");
		}
	}

}