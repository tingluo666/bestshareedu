package com.roncoo.education.user.common.bean.vo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 平台信息
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class PlatformVO implements Serializable {

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
	 * 客户端ID
	 */
	private String clientId;
	/**
	 * 客户端密匙
	 */
	private String clientSecret;
	/**
	 * 客户端名称
	 */
	private String clientName;
	/**
	 * 备注
	 */
	private String remark;

}
