package com.big_homework.untity;

public class Stu {
    private String stuId;
    private String stuName;
    private int instituteNo;
    private int stuAge;
    private String stuSex;
    private String stuPassword;

    public Stu() {
    }

    public Stu(String stuId, String stuName, int instituteNo, int stuAge, String stuSex, String stuPassword) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.instituteNo = instituteNo;
        this.stuAge = stuAge;
        this.stuSex = stuSex;
        this.stuPassword = stuPassword;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String strName) {
        this.stuName = strName;
    }

    public int getInstituteNo() {
        return instituteNo;
    }

    public void setInstituteNo(int instituteNo) {
        this.instituteNo = instituteNo;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword;
    }
}
