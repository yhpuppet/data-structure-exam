package cn.edu.hhit.dse.model.entity;

/**
 * Created by Vincent Yang on 2017/5/31.
 */
public class MultipleChoiceSelection {
    private int multipleChoiceSelectionId;
    private String multipleChoiceSelectionA;
    private String multipleChoiceSelectionB;
    private String multipleChoiceSelectionC;
    private String multipleChoiceSelectionD;

    public MultipleChoiceSelection(int multipleChoiceSelectionId, String multipleChoiceSelectionA, String multipleChoiceSelectionB, String multipleChoiceSelectionC, String multipleChoiceSelectionD) {
        this.multipleChoiceSelectionId = multipleChoiceSelectionId;
        this.multipleChoiceSelectionA = multipleChoiceSelectionA;
        this.multipleChoiceSelectionB = multipleChoiceSelectionB;
        this.multipleChoiceSelectionC = multipleChoiceSelectionC;
        this.multipleChoiceSelectionD = multipleChoiceSelectionD;
    }

    public int getMultipleChoiceSelectionId() {
        return multipleChoiceSelectionId;
    }

    public void setMultipleChoiceSelectionId(int multipleChoiceSelectionId) {
        this.multipleChoiceSelectionId = multipleChoiceSelectionId;
    }

    public String getMultipleChoiceSelectionA() {
        return multipleChoiceSelectionA;
    }

    public void setMultipleChoiceSelectionA(String multipleChoiceSelectionA) {
        this.multipleChoiceSelectionA = multipleChoiceSelectionA;
    }

    public String getMultipleChoiceSelectionB() {
        return multipleChoiceSelectionB;
    }

    public void setMultipleChoiceSelectionB(String multipleChoiceSelectionB) {
        this.multipleChoiceSelectionB = multipleChoiceSelectionB;
    }

    public String getMultipleChoiceSelectionC() {
        return multipleChoiceSelectionC;
    }

    public void setMultipleChoiceSelectionC(String multipleChoiceSelectionC) {
        this.multipleChoiceSelectionC = multipleChoiceSelectionC;
    }

    public String getMultipleChoiceSelectionD() {
        return multipleChoiceSelectionD;
    }

    public void setMultipleChoiceSelectionD(String multipleChoiceSelectionD) {
        this.multipleChoiceSelectionD = multipleChoiceSelectionD;
    }

    @Override
    public String toString() {
        return "MultipleChoiceSelection{" +
                "multipleChoiceSelectionId=" + multipleChoiceSelectionId +
                ", multipleChoiceSelectionA='" + multipleChoiceSelectionA + '\'' +
                ", multipleChoiceSelectionB='" + multipleChoiceSelectionB + '\'' +
                ", multipleChoiceSelectionC='" + multipleChoiceSelectionC + '\'' +
                ", multipleChoiceSelectionD='" + multipleChoiceSelectionD + '\'' +
                '}';
    }
}
