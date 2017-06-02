package cn.edu.hhit.dse.dao;

import cn.edu.hhit.dse.model.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Vincent Yang on 2017/5/21.
 */
@Mapper
public interface TestMapper {

    @Select("SELECT * FROM data_structure_exam.test WHERE test_id = #{testId}")
    public Test findByTestId(@Param("testId") int testId);

}
