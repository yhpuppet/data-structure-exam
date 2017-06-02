package cn.edu.hhit.dse.service.mobile;

import cn.edu.hhit.dse.model.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vincent Yang on 2017/5/31.
 */
@Service
public interface UserService {
    public int insertUser(Student student);

    public int updateUser(Student student);

    public int deleteUser(Student student);

    /**
     * 根据用户ID查询
     * @param studentNumber
     * @return
     */
    public int questUserById(int studentNumber);

    public int userSignIn(int studentNumber, String password);

}
