/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.roncoo.education.user.service.common.bo;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户基本信息
 * </p>
 *
 * @author wujing123
 */
@Data
@Accessors(chain = true)
public class UserRegionProvinceBO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 省名
	 */
	@ApiModelProperty(value = "省名", required = true)
	private String provinceName;

	/**
	 * 省ID
	 */
	@ApiModelProperty(value = "省ID", required = true)
	private Integer provinceId;

	/**
	 * 级别
	 */
	@ApiModelProperty(value = "级别", required = true)
	private Integer level;


}
