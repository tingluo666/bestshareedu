package com.roncoo.education.user.service.dao.impl.mapper;

import com.roncoo.education.user.service.dao.impl.mapper.entity.LecturerIntention;
import com.roncoo.education.user.service.dao.impl.mapper.entity.LecturerIntentionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface LecturerIntentionMapper {
    long countByExample(LecturerIntentionExample example);

    int deleteByExample(LecturerIntentionExample example);

    int insert(LecturerIntention record);

    int insertSelective(LecturerIntention record);

    List<LecturerIntention> selectByExample(LecturerIntentionExample example);

    int updateByExampleSelective(@Param("record") LecturerIntention record, @Param("example") LecturerIntentionExample example);

    int updateByExample(@Param("record") LecturerIntention record, @Param("example") LecturerIntentionExample example);
}