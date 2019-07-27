package com.roncoo.education.user.service.common.bo.auth;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author wanbo
 * @since 2019-07-25
 */
@Data
@Accessors(chain = true)
public class AuthLecturerIntentionBO implements Serializable{

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
     * 用户编号
     */
    private Long userNo;
    /**
     * 身份证号
     */
    private String idNumber;
    /**
     * 身份证正面照
     */
    private String positiveIdImgUrl;
    /**
     * 身份证反面照
     */
    private String negativeIdImgUrl;
    /**
     * 毕业证
     */
    private String diplomaImgUrl;
    /**
     * 学生证
     */
    private String studentImgUrl;
    /**
     * 学位证
     */
    private String degreeImgUrl;
    /**
     * 教师资格证
     */
    private String tqcImgUrl;
    /**
     * 学历
     */
    private String education;
    /**
     * 学校
     */
    private String school;
    /**
     * 头像
     */
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
