package com.roncoo.education.user.service.common.dto.auth;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author wanbo
 * @since 2019-07-25
 */
@Data
@Accessors(chain = true)
public class AuthLecturerIntentionViewDTO {
    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    @ApiModelProperty(value = "用户编号")
    private Long userNo;
}
