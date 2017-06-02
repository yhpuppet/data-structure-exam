package cn.edu.hhit.dse.dao.mobile;

import cn.edu.hhit.dse.model.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

/**
 * Created by Vincent Yang on 2017/5/31.
 */
@Mapper
public interface UserMapper {

    /**
     * 添加学生
     *
     * @param student
     * @return
     */
    @Insert("INSERT INTO data_structure_exam.student(student_id, student_number, password, name, sex) VALUES (#{student.studentId}, #{student.studentNumber}, #{student.password}, #{student.name}, #{student.sex})")
    public int insertUser(Student student);

    /**
     * 通过学生号查询学生
     *
     * @param studentNumber
     * @return
     */
    @Select("SELECT * FROM data_structure_exam.student WHERE student_number = #{student_number}")
    public int questUserById(@Param("student_number") int studentNumber);

    /**
     * 通过学生号和密码查询学生（学生登陆）
     *
     * @param studentNumber
     * @param password
     * @return
     */
    @Select("SELECT * FROM data_structure_exam.student WHERE student_number = #{student_number} AND password = #{password}")
    public int questUserByIdAndPassword(@Param("student_number") int studentNumber, @Param("password") String password);

}
