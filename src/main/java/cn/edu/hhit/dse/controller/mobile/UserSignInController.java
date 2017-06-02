package cn.edu.hhit.dse.controller.mobile;

import cn.edu.hhit.dse.dao.mobile.UserMapper;
import cn.edu.hhit.dse.general.ApplicationDefine;
import cn.edu.hhit.dse.service.mobile.UserService;
import cn.edu.hhit.dse.serviceImpl.mobile.UserServiceImpl;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Created by Vincent Yang on 2017/5/31.
 */

/**
 * 用户登录
 */
@RestController()
public class UserSignInController {
    @Autowired
    private UserService userService;

    // TODO: Password should be secured!
    // TODO: Check session
    @PostMapping(value = "user/signIn")
    public String userSignIn(@RequestParam("studentNumber") int studentNumber,
                          @RequestParam("password") String password) {
        HashMap<String, String> resultContent = new HashMap<>();
        if (userService.userSignIn(studentNumber, password) > 1 |
                userService.userSignIn(studentNumber, password) < 0) {
            resultContent.put(ApplicationDefine.RESULT_CONTENT_ID, "-1");
            resultContent.put(ApplicationDefine.RESULT_CONTENT_INFO, "登录出错，请稍后再次尝试！");
        } else if (userService.userSignIn(studentNumber, password) == 0) {
            resultContent.put(ApplicationDefine.RESULT_CONTENT_ID, "0");
            resultContent.put(ApplicationDefine.RESULT_CONTENT_INFO, "没有该用户，请检查用户名或注册！");
        } else if (userService.userSignIn(studentNumber, password) == 1) {
            // 登录成功
            resultContent.put(ApplicationDefine.RESULT_CONTENT_ID, "1");
            resultContent.put(ApplicationDefine.RESULT_CONTENT_INFO, "登录成功！");
        }
        Gson gson = new Gson();
        return gson.toJson(resultContent);
    }

}
