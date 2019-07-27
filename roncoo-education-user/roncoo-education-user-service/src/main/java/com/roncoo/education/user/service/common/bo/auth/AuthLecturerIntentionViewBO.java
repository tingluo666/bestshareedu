package com.roncoo.education.user.service.common.bo.auth;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wanbo
 * @since 2019-07-25
 */
@Data
@Accessors(chain = true)
public class AuthLecturerIntentionViewBO  implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 讲师用户编号
     */
    @ApiModelProperty(value = "讲师用户编号", required = true)
    private Long userNo;
}
