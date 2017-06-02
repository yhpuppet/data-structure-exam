package cn.edu.hhit.dse.controller;


import cn.edu.hhit.dse.dao.TestMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Vincent Yang on 2017/5/18.
 */
@RestController
public class HelloController {
    private TestMapper testMapper;

    public HelloController(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    @RequestMapping(value = "/greet")
    public String hello() {
        return testMapper.findByTestId(1).toString();
    }

}
