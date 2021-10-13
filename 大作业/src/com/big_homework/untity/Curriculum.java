package com.big_homework.untity;

public class Curriculum {
    private String stuId;
    private String courseId;

    public Curriculum() {
    }

    public Curriculum(String stuId, String courseId) {
        this.stuId = stuId;
        this.courseId = courseId;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}
