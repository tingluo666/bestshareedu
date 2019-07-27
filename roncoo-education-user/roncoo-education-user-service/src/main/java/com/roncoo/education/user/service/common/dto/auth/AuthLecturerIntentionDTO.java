package com.roncoo.education.user.service.common.dto.auth;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author wanbo
 * @since 2019-07-25
 */
@Data
@Accessors(chain = true)
public class AuthLecturerIntentionDTO  implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 用户编号
     */
    @ApiModelProperty(value = "主键")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long userNo;
    /**
     * 身份证号
     */
    @ApiModelProperty(value = "身份证号")
    private String idNumber;
    /**
     * 身份证正面照
     */
    @ApiModelProperty(value = "身份证正面照")
    private String positiveIdImgUrl;
    /**
     * 身份证反面照
     */
    @ApiModelProperty(value = "身份证反面照")
    private String negativeIdImgUrl;
    /**
     * 毕业证
     */
    @ApiModelProperty(value = "毕业证")
    private String diplomaImgUrl;
    /**
     * 学生证
     */
    @ApiModelProperty(value = "学生证")
    private String studentImgUrl;
    /**
     * 学位证
     */
    @ApiModelProperty(value = "学位证")
    private String degreeImgUrl;
    /**
     * 教师资格证
     */
    @ApiModelProperty(value = "教师资格证")
    private String tqcImgUrl;
    /**
     * 学历
     */
    @ApiModelProperty(value = "学历")
    private String education;
    /**
     * 头像
     */
    @ApiModelProperty(value = "学校")
    private String school;
    private String experience;
    private String award;
    private String achievement;
    private String province;
    private String city;
    private String address;
    private String tqcNumber;
    private ArrayList grade;
    private ArrayList subject;
}
