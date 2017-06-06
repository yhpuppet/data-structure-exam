package cn.edu.hhit.dse.model.entity;

/**
 * Created by Vincent Yang on 2017/6/7.
 */

/**
 * 判断题（整合题目和答案）
 */
public class TrueOrFalseTopic {
    private int TrueOrFalseTopicId; // equal to 'trueOrFalseQuestionId'
    private String question;
    private int answer;
    private int type; // default value: 1


    public TrueOrFalseTopic(int trueOrFalseTopicId, String question, int answer, int type) {
        TrueOrFalseTopicId = trueOrFalseTopicId;
        this.question = question;
        this.answer = answer;
        this.type = type;
    }

    public TrueOrFalseTopic(int trueOrFalseTopicId, String question, int answer) {
        TrueOrFalseTopicId = trueOrFalseTopicId;
        this.question = question;
        this.answer = answer;
        this.type = 1;
    }

    public int getTrueOrFalseTopicId() {
        return TrueOrFalseTopicId;
    }

    public void setTrueOrFalseTopicId(int trueOrFalseTopicId) {
        TrueOrFalseTopicId = trueOrFalseTopicId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "TrueOrFalseTopic{" +
                "TrueOrFalseTopicId=" + TrueOrFalseTopicId +
                ", type=" + type +
                ", answer=" + answer +
                '}';
    }
}
