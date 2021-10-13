package com.big_homework.untity;

public class Course {
    private String courseId;
    private String courseName;
    private int courseLast;
    private int courseScore;
    private int instituteNo;
    private int courseTime;
    private int CourseType;
    private String TeachName;

    public Course() {
    }

    public Course(String courseId, String courseName, int courseLast, int courseScore, int instituteNo, int courseTime, int courseType, String teachName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseLast = courseLast;
        this.courseScore = courseScore;
        this.instituteNo = instituteNo;
        this.courseTime = courseTime;
        CourseType = courseType;
        TeachName = teachName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseLast() {
        return courseLast;
    }

    public void setCourseLast(int courseLast) {
        this.courseLast = courseLast;
    }

    public int getCourseScore() {
        return courseScore;
    }

    public void setCourseScore(int courseScore) {
        this.courseScore = courseScore;
    }

    public int getInstituteNo() {
        return instituteNo;
    }

    public void setInstituteNo(int instituteNo) {
        this.instituteNo = instituteNo;
    }

    public int getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(int courseTime) {
        this.courseTime = courseTime;
    }

    public int getCourseType() {
        return CourseType;
    }

    public void setCourseType(int courseType) {
        CourseType = courseType;
    }

    public String getTeachName() {
        return TeachName;
    }

    public void setTeachName(String teachName) {
        TeachName = teachName;
    }
}
