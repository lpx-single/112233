package com.big_homework.untity;

public class Teacher {
    private String teachId;
    private String teachName;
    private String teachSex;
    private int instituteNo;
    private String TeachField;
    private String courseName;

    public Teacher() {
    }

    public Teacher(String teachId, String teachName, String teachSex, int instituteNo, String teachField, String courseName) {
        this.teachId = teachId;
        this.teachName = teachName;
        this.teachSex = teachSex;
        this.instituteNo = instituteNo;
        TeachField = teachField;
        this.courseName = courseName;
    }

    public String getTeachId() {
        return teachId;
    }

    public void setTeachId(String teachId) {
        this.teachId = teachId;
    }

    public String getTeachName() {
        return teachName;
    }

    public void setTeachName(String teachName) {
        this.teachName = teachName;
    }

    public String getTeachSex() {
        return teachSex;
    }

    public void setTeachSex(String teachSex) {
        this.teachSex = teachSex;
    }

    public int getInstituteNo() {
        return instituteNo;
    }

    public void setInstituteNo(int instituteNo) {
        this.instituteNo = instituteNo;
    }

    public String getTeachField() {
        return TeachField;
    }

    public void setTeachField(String teachField) {
        TeachField = teachField;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
