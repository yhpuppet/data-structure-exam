package cn.edu.hhit.dse.model.entity;

/**
 * Created by Vincent Yang on 2017/5/30.
 */
public class Teacher {
    private int teacherId;
    private int teacherNumber;
    private String password;
    private String name;
    private char sex;

    public Teacher(int teacherId, int teacherNumber, String password, String name, char sex) {
        this.teacherId = teacherId;
        this.teacherNumber = teacherNumber;
        this.password = password;
        this.name = name;
        this.sex = sex;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(int teacherNumber) {
        this.teacherNumber = teacherNumber;
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

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherNumber=" + teacherNumber +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
