package cn.edu.hhit.dse.model.entity;

/**
 * Created by Vincent Yang on 2017/5/30.
 */
public class MultipleChoiceQuestion {
    private int multipleChoiceQuestionId;
    private String question;

    public MultipleChoiceQuestion(int multipleChoiceQuestionId, String question) {
        this.multipleChoiceQuestionId = multipleChoiceQuestionId;
        this.question = question;
    }

    public int getMultipleChoiceQuestionId() {
        return multipleChoiceQuestionId;
    }

    public void setMultipleChoiceQuestionId(int multipleChoiceQuestionId) {
        this.multipleChoiceQuestionId = multipleChoiceQuestionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "MultipleChoiceQuestion{" +
                "multipleChoiceQuestionId=" + multipleChoiceQuestionId +
                ", question='" + question + '\'' +
                '}';
    }
}
