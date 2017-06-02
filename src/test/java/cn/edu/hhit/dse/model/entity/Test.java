package cn.edu.hhit.dse.model.entity;

/**
 * Created by Vincent Yang on 2017/5/21.
 */
public class Test {
    private int testId;
    private int number;

    public Test(int testId, int number) {
        this.testId = testId;
        this.number = number;
    }

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Test{" +
                "testId=" + testId +
                ", number=" + number +
                '}';
    }
}
