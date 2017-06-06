package cn.edu.hhit.dse.model.entity;

/**
 * Created by Vincent Yang on 2017/5/30.
 */
public class Student {
    private int studentId;
    private int studentNumber;
    private String password;
    private String name;
    private char sex;
    private int type; // 用户类型

    public Student(int studentId, int studentNumber, String password, String name, char sex, int type) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.type = type;
    }

    public Student(int studentNumber, String password, String name, char sex) {
        this.studentNumber = studentNumber;
        this.password = password;
        this.name = name;
        this.sex = sex;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber=" + studentNumber +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", type=" + type +
                '}';
    }
}
