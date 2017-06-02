package cn.edu.hhit.dse.model.entity;

/**
 * Created by Vincent Yang on 2017/5/31.
 */
public class MultipleChoiceAnswer {
    private int multipleChoiceAnswerId;
    private int answer;

    public MultipleChoiceAnswer(int multipleChoiceAnswerId, int answer) {
        this.multipleChoiceAnswerId = multipleChoiceAnswerId;
        this.answer = answer;
    }

    public int getMultipleChoiceAnswerId() {
        return multipleChoiceAnswerId;
    }

    public void setMultipleChoiceAnswerId(int multipleChoiceAnswerId) {
        this.multipleChoiceAnswerId = multipleChoiceAnswerId;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "MultipleChoiceAnswer{" +
                "multipleChoiceAnswerId=" + multipleChoiceAnswerId +
                ", answer=" + answer +
                '}';
    }
}
