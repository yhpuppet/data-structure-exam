package cn.edu.hhit.dse.controller.mobile;

import cn.edu.hhit.dse.general.ApplicationDefine;
import cn.edu.hhit.dse.model.entity.Student;
import cn.edu.hhit.dse.service.mobile.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by Vincent Yang on 2017/6/2.
 */

/**
 * 用户注册
 */
@RestController(value = "")
public class UserSignUpController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/signUp")
    public String userSignUp(@Param("studentNumber") int studentNumber,
                             @Param("password") String password,
                             @Param("name") String name,
                             @Param("sex") char sex) {
        HashMap<String, String> resultContent = new HashMap<>();
        int isStudentExist = userService.questUserById(studentNumber);
        if (isStudentExist == 0) {
            Student student = new Student(studentNumber, password, name, sex);
            if (userService.insertUser(student) == 1) {
                resultContent.put(ApplicationDefine.RESULT_CONTENT_ID, "1");
                resultContent.put(ApplicationDefine.RESULT_CONTENT_INFO, "注册成功！");
            } else {
                resultContent.put(ApplicationDefine.RESULT_CONTENT_ID, "0");
                resultContent.put(ApplicationDefine.RESULT_CONTENT_INFO, "注册失败，请稍后重试！");
            }
        } else if (isStudentExist == 1) {
            // 用户已经存在
            resultContent.put(ApplicationDefine.RESULT_CONTENT_ID, "0");
            resultContent.put(ApplicationDefine.RESULT_CONTENT_INFO, "改学号已经注册！");
        }
        return String.valueOf(resultContent);
    }

}
