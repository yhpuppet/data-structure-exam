package cn.edu.hhit.dse.serviceImpl.mobile;

import cn.edu.hhit.dse.dao.mobile.UserMapper;
import cn.edu.hhit.dse.model.entity.Student;
import cn.edu.hhit.dse.service.mobile.UserService;
import org.springframework.stereotype.Component;

/**
 * Created by Vincent Yang on 2017/5/31.
 */
@Component
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int insertUser(Student student) {
        return 0;
    }

    @Override
    public int updateUser(Student student) {
        return 0;
    }

    @Override
    public int deleteUser(Student student) {
        return 0;
    }

    @Override
    public int questUserById(int studentNumber) {
        return userMapper.questUserById(studentNumber);
    }

    @Override
    public int userSignIn(int studentNumber, String password) {
        return userMapper.questUserByIdAndPassword(studentNumber, password);
    }
}
