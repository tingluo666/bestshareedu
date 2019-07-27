package com.roncoo.education.user.service.dao.impl;

import com.netflix.discovery.converters.Auto;
import com.roncoo.education.user.service.dao.LecturerIntentionDao;
import com.roncoo.education.user.service.dao.impl.mapper.LecturerIntentionMapper;
import com.roncoo.education.user.service.dao.impl.mapper.entity.LecturerIntention;
import com.roncoo.education.user.service.dao.impl.mapper.entity.LecturerIntentionExample;
import com.roncoo.education.user.service.dao.impl.mapper.entity.UserExt;
import com.roncoo.education.user.service.dao.impl.mapper.entity.UserExtExample;
import com.roncoo.education.util.tools.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wanbo
 * @since 2019-07-25
 */
@Repository
public class LecturerIntentionDaoImpl implements LecturerIntentionDao {

    @Autowired
    LecturerIntentionMapper lecturerIntentionMapper;

    @Override
    public LecturerIntention getByUserNo(Long userNo) {
        LecturerIntentionExample example = new LecturerIntentionExample();
        LecturerIntentionExample.Criteria criteria = example.createCriteria();
        criteria.andUserNoEqualTo(userNo);
        List<LecturerIntention> list = lecturerIntentionMapper.selectByExample(example);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public int updateByUserNo(LecturerIntention record) {
        LecturerIntentionExample example = new LecturerIntentionExample();
        example.createCriteria().andUserNoEqualTo(record.getUserNo());
        return lecturerIntentionMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int save(LecturerIntention record) {
        record.setId(IdWorker.getId());
        return lecturerIntentionMapper.insertSelective(record);
    }
}
