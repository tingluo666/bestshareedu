package com.roncoo.education.user.service.biz.auth;

import com.roncoo.education.user.service.common.bo.auth.AuthLecturerIntentionBO;
import com.roncoo.education.user.service.common.bo.auth.AuthLecturerIntentionViewBO;
import com.roncoo.education.user.service.common.dto.auth.AuthLecturerIntentionDTO;
import com.roncoo.education.user.service.common.dto.auth.AuthLecturerIntentionViewDTO;
import com.roncoo.education.user.service.dao.LecturerIntentionDao;
import com.roncoo.education.user.service.dao.impl.mapper.entity.LecturerIntention;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.roncoo.education.system.feign.IBossSys;
import com.roncoo.education.user.service.common.bo.auth.AuthUserExtBO;
import com.roncoo.education.user.service.common.bo.auth.AuthUserExtViewBO;
import com.roncoo.education.user.service.common.dto.auth.AuthUserExtDTO;
import com.roncoo.education.user.service.dao.UserExtDao;
import com.roncoo.education.user.service.dao.impl.mapper.entity.UserExt;
import com.roncoo.education.util.aliyun.Aliyun;
import com.roncoo.education.util.aliyun.AliyunUtil;
import com.roncoo.education.util.base.BaseBiz;
import com.roncoo.education.util.base.Result;
import com.roncoo.education.util.enums.ResultEnum;
import com.roncoo.education.util.tools.BeanUtil;
import com.xiaoleilu.hutool.util.ObjectUtil;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 用户教育信息
 *
 * @author wujing
 */
@Component
public class AuthApiUserExtBiz extends BaseBiz {

	@Autowired
	private UserExtDao userExtDao;

	@Autowired
	private LecturerIntentionDao lecturerIntentionDao;

	@Autowired
	private IBossSys bossSys;

	/**
	 * 用户信息查看接口
	 * 
	 * @param authUserExtViewBO
	 * @author wuyun
	 */
	public Result<AuthUserExtDTO> view(AuthUserExtViewBO authUserExtViewBO) {
		if (ObjectUtil.isNull(authUserExtViewBO)) {
			return Result.error("authUserExtUserNoBO不能为空");
		}
		if (null == authUserExtViewBO.getUserNo()) {
			return Result.error("userNo不能为空");
		}
		UserExt userExt = userExtDao.getByUserNo(authUserExtViewBO.getUserNo());
		if (userExt == null) {
			return Result.error("找不到该用户信息");
		}
		return Result.success(BeanUtil.copyProperties(userExt, AuthUserExtDTO.class));
	}

	/**
	 * 用户信息查看接口
	 *
	 * @param authLecturerIntentionViewDTO
	 * @author wuyun
	 */
	public Result<AuthLecturerIntentionDTO> viewLecturerIntention(AuthLecturerIntentionViewBO authLecturerIntentionViewDTO) {
		if (ObjectUtil.isNull(authLecturerIntentionViewDTO)) {
			return Result.error("authUserExtUserNoBO不能为空");
		}
		if (null == authLecturerIntentionViewDTO.getUserNo()) {
			return Result.error("userNo不能为空");
		}
		LecturerIntention lecturerIntention = lecturerIntentionDao.getByUserNo(authLecturerIntentionViewDTO.getUserNo());
		if (lecturerIntention == null) {
			return Result.error("找不到该用户信息");
		}
		AuthLecturerIntentionDTO authLecturerIntentionDTO = BeanUtil.copyProperties(lecturerIntention, AuthLecturerIntentionDTO.class);
		if(null != lecturerIntention.getGrade() && !"".equals(lecturerIntention.getGrade())){
			String[] grades = lecturerIntention.getGrade().split(", ");
			ArrayList<String> gradeList = new ArrayList<String>();
			for (String g:grades){
				gradeList.add(g);
			}
			authLecturerIntentionDTO.setGrade(gradeList);
		}
		if(null != lecturerIntention.getSubject() && !"".equals(lecturerIntention.getSubject())){
			String[] subjects = lecturerIntention.getSubject().split(", ");
			ArrayList<String> subjectList = new ArrayList<String>();
			for (String s:subjects){
				subjectList.add(s);
			}
			authLecturerIntentionDTO.setSubject(subjectList);
		}
		return Result.success(authLecturerIntentionDTO);
	}
	/**
	 * 用户信息查看接口
	 *
	 * @param authUserExtViewBO
	 * @author wuyun
	 */
	public Result<AuthUserExtDTO> viewUserIntention(AuthUserExtViewBO authUserExtViewBO) {
		if (ObjectUtil.isNull(authUserExtViewBO)) {
			return Result.error("authUserExtUserNoBO不能为空");
		}
		if (null == authUserExtViewBO.getUserNo()) {
			return Result.error("userNo不能为空");
		}
		UserExt userExt = userExtDao.getByUserNo(authUserExtViewBO.getUserNo());
		if (userExt == null) {
			return Result.error("找不到该用户信息");
		}
		return Result.success(BeanUtil.copyProperties(userExt, AuthUserExtDTO.class));
	}


	/**
	 * 用户信息更新接口
	 *
	 * @param authUserExtBO
	 * @author wuyun
	 */
	public Result<AuthUserExtDTO> update(AuthUserExtBO authUserExtBO) {
		if (authUserExtBO.getId() == null) {
			return Result.error("Id不能为空");
		}
		if (authUserExtBO.getUserNo() == null) {
			return Result.error("userNo不能为空");
		}

		// 根据传入userNo查找到对应的用户信息
		UserExt userExt = userExtDao.getByUserNo(authUserExtBO.getUserNo());
		if (ObjectUtil.isNull(userExt)) {
			return Result.error("没找到对应的用户信息");
		}
		// 如果修改图片删除阿里云oss上的原图片
//		if (!StringUtils.isEmpty(authUserExtBO.getHeadImgUrl())) {
//			if (!StringUtils.isEmpty(userExt.getHeadImgUrl()) && !authUserExtBO.getHeadImgUrl().equals(userExt.getHeadImgUrl())) {
//				AliyunUtil.delete(userExt.getHeadImgUrl(), BeanUtil.copyProperties(bossSys.getSys(), Aliyun.class));
//			}
//		}
		userExt = BeanUtil.copyProperties(authUserExtBO, UserExt.class);
		int resultNum = userExtDao.updateByUserNo(userExt);
		if (resultNum > 0) {
			// 修改成功返回用户信息
			UserExt education = userExtDao.getByUserNo(authUserExtBO.getUserNo());
			AuthUserExtDTO dto = BeanUtil.copyProperties(education, AuthUserExtDTO.class);
			return Result.success(dto);
		}
		return Result.error(ResultEnum.USER_UPDATE_FAIL.getDesc());

	}
	/**
	 * 用户信息更新接口
	 * 
	 * @param authLecturerIntentionBO
	 * @author wuyun
	 */
	public Result<AuthLecturerIntentionDTO> updateLecturerIntention(AuthLecturerIntentionBO authLecturerIntentionBO) {
		if (authLecturerIntentionBO.getId() == null) {
			return Result.error("Id不能为空");
		}
		if (authLecturerIntentionBO.getUserNo() == null) {
			return Result.error("userNo不能为空");
		}

		// 根据传入userNo查找到对应的用户信息
		LecturerIntention lecturerIntention = lecturerIntentionDao.getByUserNo(authLecturerIntentionBO.getUserNo());
		if (ObjectUtil.isNull(lecturerIntention)) {
			return Result.error("没找到对应的用户信息");
		}
		// 如果修改图片删除阿里云oss上的原图片
		if (!StringUtils.isEmpty(authLecturerIntentionBO.getPositiveIdImgUrl())) {
			if (!StringUtils.isEmpty(lecturerIntention.getPositiveIdImgUrl()) && !authLecturerIntentionBO.getPositiveIdImgUrl().equals(lecturerIntention.getPositiveIdImgUrl())) {
				AliyunUtil.delete(lecturerIntention.getPositiveIdImgUrl(), BeanUtil.copyProperties(bossSys.getSys(), Aliyun.class));
			}
		}
        if (!StringUtils.isEmpty(authLecturerIntentionBO.getNegativeIdImgUrl())) {
            if (!StringUtils.isEmpty(lecturerIntention.getNegativeIdImgUrl()) && !authLecturerIntentionBO.getNegativeIdImgUrl().equals(lecturerIntention.getNegativeIdImgUrl())) {
                AliyunUtil.delete(lecturerIntention.getNegativeIdImgUrl(), BeanUtil.copyProperties(bossSys.getSys(), Aliyun.class));
            }
        }
        if (!StringUtils.isEmpty(authLecturerIntentionBO.getDegreeImgUrl())) {
            if (!StringUtils.isEmpty(lecturerIntention.getDegreeImgUrl()) && !authLecturerIntentionBO.getDegreeImgUrl().equals(lecturerIntention.getDegreeImgUrl())) {
                AliyunUtil.delete(lecturerIntention.getDegreeImgUrl(), BeanUtil.copyProperties(bossSys.getSys(), Aliyun.class));
            }
        }
        if (!StringUtils.isEmpty(authLecturerIntentionBO.getDiplomaImgUrl())) {
            if (!StringUtils.isEmpty(lecturerIntention.getDiplomaImgUrl()) && !authLecturerIntentionBO.getDiplomaImgUrl().equals(lecturerIntention.getDiplomaImgUrl())) {
                AliyunUtil.delete(lecturerIntention.getDiplomaImgUrl(), BeanUtil.copyProperties(bossSys.getSys(), Aliyun.class));
            }
        }
        if (!StringUtils.isEmpty(authLecturerIntentionBO.getStudentImgUrl())) {
            if (!StringUtils.isEmpty(lecturerIntention.getStudentImgUrl()) && !authLecturerIntentionBO.getStudentImgUrl().equals(lecturerIntention.getStudentImgUrl())) {
                AliyunUtil.delete(lecturerIntention.getStudentImgUrl(), BeanUtil.copyProperties(bossSys.getSys(), Aliyun.class));
            }
        }
        if (!StringUtils.isEmpty(authLecturerIntentionBO.getTqcImgUrl())) {
            if (!StringUtils.isEmpty(lecturerIntention.getTqcImgUrl()) && !authLecturerIntentionBO.getTqcImgUrl().equals(lecturerIntention.getTqcImgUrl())) {
                AliyunUtil.delete(lecturerIntention.getTqcImgUrl(), BeanUtil.copyProperties(bossSys.getSys(), Aliyun.class));
            }
        }
        if (!StringUtils.isEmpty(authLecturerIntentionBO.getPositiveIdImgUrl())) {
            if (!StringUtils.isEmpty(lecturerIntention.getPositiveIdImgUrl()) && !authLecturerIntentionBO.getPositiveIdImgUrl().equals(lecturerIntention.getPositiveIdImgUrl())) {
                AliyunUtil.delete(lecturerIntention.getPositiveIdImgUrl(), BeanUtil.copyProperties(bossSys.getSys(), Aliyun.class));
            }
        }

		lecturerIntention = BeanUtil.copyProperties(authLecturerIntentionBO, LecturerIntention.class);
		lecturerIntention.setGrade(authLecturerIntentionBO.getGrade().toString().replace("[","").replace("]",""));
        lecturerIntention.setSubject(authLecturerIntentionBO.getSubject().toString().replace("[","").replace("]",""));
		int resultNum = lecturerIntentionDao.updateByUserNo(lecturerIntention);
		if (resultNum > 0) {
			// 修改成功返回用户信息
			LecturerIntention education = lecturerIntentionDao.getByUserNo(authLecturerIntentionBO.getUserNo());
			AuthLecturerIntentionDTO dto = BeanUtil.copyProperties(education, AuthLecturerIntentionDTO.class);
			return Result.success(dto);
		}
		return Result.error(ResultEnum.USER_UPDATE_FAIL.getDesc());

	}

}
