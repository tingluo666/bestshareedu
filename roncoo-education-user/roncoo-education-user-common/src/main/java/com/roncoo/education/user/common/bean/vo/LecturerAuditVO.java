package com.roncoo.education.user.common.bean.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 讲师信息-审核
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class LecturerAuditVO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private Long id;
	/**
	 * 创建时间
	 */
	private Date gmtCreate;
	/**
	 * 修改时间
	 */
	private Date gmtModified;
	/**
	 * 状态(1:正常，0:禁用)
	 */
	private Integer statusId;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 审核状态(0:待审核,1:审核通过,2:审核不通过)
	 */
	private Integer auditStatus;
	/**
	 * 审核意见
	 */
	private String auditOpinion;
	/**
	 * 讲师用户编号
	 */
	private Long lecturerUserNo;
	/**
	 * 讲师名称
	 */
	private String lecturerName;
	/**
	 * 讲师手机
	 */
	private String lecturerMobile;
	/**
	 * 讲师邮箱
	 */
	private String lecturerEmail;
	/**
	 * 职位
	 */
	private String position;
	/**
	 * 头像
	 */
	private String headImgUrl;
	/**
	 * 简介
	 */
	private String introduce;
	/**
	 * 讲师分成比例
	 */
	private BigDecimal lecturerProportion;
	/**
	 * 讲师账号信息表
	 */
	private LecturerExtVO lecturerExtVO;

	/**
	 * 校验讲师用户、讲师是否存在(1:用户不存在 2:讲师存在) (添加讲师时候使用)
	 */
	private Integer checkUserAndLecturer;
}
