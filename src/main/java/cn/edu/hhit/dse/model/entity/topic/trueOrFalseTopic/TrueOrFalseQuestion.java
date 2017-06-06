package cn.edu.hhit.dse.model.entity;

/**
 * Created by Vincent Yang on 2017/6/5.
 */

/**
 * 判断题的题目
 */
public class TrueOrFalseQuestion {
    private int trueOrFalseQuestionId;
    private int type; // default value: 1
    private String question;

    public TrueOrFalseQuestion(int trueOrFalseQuestionId, int type, String question) {
        this.trueOrFalseQuestionId = trueOrFalseQuestionId;
        this.type = type;
        this.question = question;
    }

    public int getTrueOrFalseQuestionId() {
        return trueOrFalseQuestionId;
    }

    public void setTrueOrFalseQuestionId(int trueOrFalseQuestionId) {
        this.trueOrFalseQuestionId = trueOrFalseQuestionId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "TrueOrFalseQuestionService{" +
                "trueOrFalseQuestionId=" + trueOrFalseQuestionId +
                ", type=" + type +
                ", question='" + question + '\'' +
                '}';
    }
}
