package cn.edu.hhit.dse.model.entity;

/**
 * Created by Vincent Yang on 2017/6/5.
 */

/**
 * 判断题的答案
 */
public class TrueOrFalseAnswer {
    private int trueOrFalseAnswerId;
    private int trueOrFalseQuestionId; // 对应的判断题的问题的ID
    private int answer; // { 0 : "错", 1 : "对" }

    public TrueOrFalseAnswer(int trueOrFalseAnswerId, int trueOrFalseQuestionId, int answer) {
        this.trueOrFalseAnswerId = trueOrFalseAnswerId;
        this.trueOrFalseQuestionId = trueOrFalseQuestionId;
        this.answer = answer;
    }

    public int getTrueOrFalseAnswerId() {
        return trueOrFalseAnswerId;
    }

    public void setTrueOrFalseAnswerId(int trueOrFalseAnswerId) {
        this.trueOrFalseAnswerId = trueOrFalseAnswerId;
    }

    public int getTrueOrFalseQuestionId() {
        return trueOrFalseQuestionId;
    }

    public void setTrueOrFalseQuestionId(int trueOrFalseQuestionId) {
        this.trueOrFalseQuestionId = trueOrFalseQuestionId;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "TrueOrFalseAnswer{" +
                "trueOrFalseAnswerId=" + trueOrFalseAnswerId +
                ", trueOrFalseQuestionId=" + trueOrFalseQuestionId +
                ", answer=" + answer +
                '}';
    }
}
