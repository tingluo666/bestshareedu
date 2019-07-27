package com.roncoo.education.user.service.common.bo.auth;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 用户账户信息表
 *
 * @author wanbo
 */
@Data
@Accessors(chain = true)
public class UserInfoUpdateBO {

    private static final long serialVersionUID = 1L;

    /**
     * clientId
     */
    @ApiModelProperty(value = "clientId")
    private String clientId;
    /**
     * nickName
     */
    @ApiModelProperty(value = "nickName")
    private String nickName;
    /**
     * age
     */
    @ApiModelProperty(value = "age")
    private String age;
    /**
     * sex
     */
    @ApiModelProperty(value = "sex")
    private String sex;
    /**
     * headImageUrl
     */
    @ApiModelProperty(value = "headImageUrl")
    private String headImageUrl;
}
