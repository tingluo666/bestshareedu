package com.roncoo.education.user.service.dao;

import com.roncoo.education.user.service.dao.impl.mapper.entity.LecturerIntention;
import com.roncoo.education.user.service.dao.impl.mapper.entity.UserExt;

/**
 * @author wanbo
 * @since 2019-07-25
 */
public interface LecturerIntentionDao {
    LecturerIntention getByUserNo(Long userNo);

    int updateByUserNo(LecturerIntention record);

    int save(LecturerIntention record);


}
