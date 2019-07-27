package com.roncoo.education.user.service.api.auth;

import com.roncoo.education.user.service.common.bo.auth.AuthLecturerIntentionBO;
import com.roncoo.education.user.service.common.bo.auth.AuthLecturerIntentionViewBO;
import com.roncoo.education.user.service.common.dto.auth.AuthLecturerIntentionDTO;
import com.roncoo.education.user.service.common.dto.auth.AuthLecturerIntentionViewDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.roncoo.education.user.service.biz.auth.AuthApiUserExtBiz;
import com.roncoo.education.user.service.common.bo.auth.AuthUserExtBO;
import com.roncoo.education.user.service.common.bo.auth.AuthUserExtViewBO;
import com.roncoo.education.user.service.common.dto.auth.AuthUserExtDTO;
import com.roncoo.education.util.base.BaseController;
import com.roncoo.education.util.base.Result;

import io.swagger.annotations.ApiOperation;

/**
 * 用户教育信息
 *
 * @author wujing
 */
@RestController
@RequestMapping(value = "/user/auth/user/ext")
public class AuthApiUserExtController extends BaseController {

	@Autowired
	private AuthApiUserExtBiz biz;

	/**
	 * 用户信息查看接口
	 */
	@ApiOperation(value = "用户信息查看接口", notes = "根据userNo获取用户信息接口")
	@RequestMapping(value = "/view", method = RequestMethod.POST)
	public Result<AuthUserExtDTO> view(@RequestBody AuthUserExtViewBO authUserExtViewBO) {
		return biz.view(authUserExtViewBO);
	}

	/**
	 * 用户信息更新接口
	 */
	@ApiOperation(value = "用户信息更新接口", notes = "用户信息更新接口")
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public Result<AuthUserExtDTO> update(@RequestBody AuthUserExtBO authUserExtBO) {
		return biz.update(authUserExtBO);
	}

	/**
	 * 教学意向查看接口
	 */
	@ApiOperation(value = "教学意向查看接口", notes = "教学意向查看接口")
	@RequestMapping(value = "/viewLecturerIntention", method = RequestMethod.POST)
	public Result<AuthLecturerIntentionDTO> viewLecturerIntention(@RequestBody AuthLecturerIntentionViewBO authUserExtViewBO) {
		return biz.viewLecturerIntention(authUserExtViewBO);
	}
	/**
	 * 教学意向更新接口
	 */
	@ApiOperation(value = "教学意向更新接口", notes = "教学意向更新接口")
	@RequestMapping(value = "/updateLecturerIntention", method = RequestMethod.POST)
	public Result<AuthLecturerIntentionDTO> updateLecturerIntention(@RequestBody AuthLecturerIntentionBO authLecturerIntentionBO) {
		return biz.updateLecturerIntention(authLecturerIntentionBO);
	}

	/**
	 * 学习意向查看接口
	 */
	@ApiOperation(value = "学习意向查看接口", notes = "学习意向查看接口")
	@RequestMapping(value = "/viewUserIntention", method = RequestMethod.POST)
	public Result<AuthUserExtDTO> viewUserIntention(@RequestBody AuthUserExtViewBO authUserExtViewBO) {
		return biz.view(authUserExtViewBO);
	}

	/**
	 * 教学意向更新接口
	 */
	@ApiOperation(value = "教学意向更新接口", notes = "教学意向更新接口")
	@RequestMapping(value = "/updateUserIntention", method = RequestMethod.POST)
	public Result<AuthUserExtDTO> updateUserIntention(@RequestBody AuthUserExtBO authUserExtBO) {
		return biz.update(authUserExtBO);
	}
}
