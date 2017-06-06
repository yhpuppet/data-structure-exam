package cn.edu.hhit.dse.controller.mobile;

import cn.edu.hhit.dse.service.mobile.TrueOrFalseAnswerService;
import cn.edu.hhit.dse.service.mobile.TrueOrFalseQuestionService;
import com.google.gson.Gson;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * Created by Vincent Yang on 2017/6/6.
 */
@Controller
public class TrueOrFalseQuestionController {
    @Autowired
    private TrueOrFalseQuestionService trueOrFalseQuestionService;

    @Autowired
    private TrueOrFalseAnswerService trueOrFalseAnswerService;

    /**
     * 通过ID获取判断题
     * @param trueOrFalseQuestionId
     * @return
     */
    @RequestMapping(value = "/question/trueOrFalseQuestion/obtainQuestion")
    public String obtainQuestionById(@Param(value = "trueOrFalseQuestionId") int trueOrFalseQuestionId) {
        String question = trueOrFalseQuestionService.questTrueOrFalseQuestionById(trueOrFalseQuestionId);
        int answer = trueOrFalseAnswerService.questTrueOrFalseAnswerByTrueOrFalseQuestionId(trueOrFalseQuestionId);
        HashMap<String, String> resultContent = new HashMap<>();
        resultContent.put("question", question);
        resultContent.put("answer", String.valueOf(answer));
        return new Gson().toJson(resultContent);
    }
 }
