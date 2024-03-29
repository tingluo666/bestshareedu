package com.roncoo.education.course.service.common.dto.auth;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 课时信息-审核
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class AuthPeriodAuditViewDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 课时ID
     */
    @ApiModelProperty(value = "课时ID")
	@JsonSerialize(using = ToStringSerializer.class)
    private Long id;
    /**
     * 审核状态(0:待审核;1:审核通过;2:审核不通过)
     */
    @ApiModelProperty(value = "审核状态(0:待审核;1:审核通过;2:审核不通过)")
    private Integer auditStatus;
    /**
     * 课时名称
     */
    @ApiModelProperty(value = "课时名称")
    private String periodName;
    /**
     * 课时描述
     */
    @ApiModelProperty(value = "课时描述")
    private String periodDesc;
    /**
     * 是否免费：1免费，0收费
     */
    @ApiModelProperty(value = "是否免费：1免费，0收费")
    private Integer isFree;
    /**
	 * 是否存在文档
	 */
	@ApiModelProperty(value = "是否存在文档")
	private Integer isDoc;
	/**
	 * 文档名称
	 */
	@ApiModelProperty(value = "文档名称")
	private String docName;
	/**
	 * 文档地址
	 */
	@ApiModelProperty(value = "文档地址")
	private String docUrl;
	/**
	 * 是否存在视频
	 */
	@ApiModelProperty(value = "是否存在视频")
	private Integer isVideo;
	/**
	 * 视频编号
	 */
	@ApiModelProperty(value = "视频编号")
	@JsonSerialize(using = ToStringSerializer.class)
	private Long videoNo;
	/**
	 * 视频名称
	 */
	@ApiModelProperty(value = "视频名称")
	private String videoName;
	/**
	 * 时长
	 */
	@ApiModelProperty(value = "时长")
	private String videoLength;
	/**
	 * 视频Vid
	 */
	@ApiModelProperty(value = "视频Vid")
	private String videoVid;
	/**
	 * 阿里云oas
	 */
	@ApiModelProperty(value = "阿里云oas")
	private String videoOasId;
}
