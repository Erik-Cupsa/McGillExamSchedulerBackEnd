package com.mcgill.examscheduler.exam;

import java.sql.Timestamp;

public class Exam {
    private String course;
    private String section;
    private String courseTitle;
    private String examType;
    private Timestamp examStart;
    private Timestamp examEnd;
    private String building;
    private String room;
    private String rows;
    private String rowStart;
    private String rowEnd;

    public Exam(String course, String section, String courseTitle, String examType, Timestamp examStart, Timestamp examEnd, String building, String room, String rows, String rowStart, String rowEnd) {
        this.course = course;
        this.section = section;
        this.courseTitle = courseTitle;
        this.examType = examType;
        this.examStart = examStart;
        this.examEnd = examEnd;
        this.building = building;
        this.room = room;
        this.rows = rows;
        this.rowStart = rowStart;
        this.rowEnd = rowEnd;
    }

    public Exam(String course, String section, String courseTitle, String examType, Timestamp examStart, Timestamp examEnd, String building, String room, String rowStart, String rowEnd) {
        this.course = course;
        this.section = section;
        this.courseTitle = courseTitle;
        this.examType = examType;
        this.examStart = examStart;
        this.examEnd = examEnd;
        this.building = building;
        this.room = room;
        this.rows = null;
        this.rowStart = rowStart;
        this.rowEnd = rowEnd;
    }

    public Exam() {
    }

    public String getCourse() {
        return course;
    }

    public String getSection() {
        return section;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public String getExamType() {
        return examType;
    }

    public Timestamp getExamStart() {
        return examStart;
    }

    public Timestamp getExamEnd() {
        return examEnd;
    }

    public String getBuilding() {
        return building;
    }

    public String getRoom() {
        return room;
    }

    public String getRows() {
        return rows;
    }

    public String getRowStart() {
        return rowStart;
    }

    public String getRowEnd() {
        return rowEnd;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public void setExamStart(Timestamp examStart) {
        this.examStart = examStart;
    }

    public void setExamEnd(Timestamp examEnd) {
        this.examEnd = examEnd;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setRows(String rows) {
        this.rows = rows;
    }

    public void setRowStart(String rowStart) {
        this.rowStart = rowStart;
    }

    public void setRowEnd(String rowEnd) {
        this.rowEnd = rowEnd;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "course='" + course + '\'' +
                ", section='" + section + '\'' +
                ", courseTitle='" + courseTitle + '\'' +
                ", examType='" + examType + '\'' +
                ", examStart=" + examStart +
                ", examEnd=" + examEnd +
                ", building='" + building + '\'' +
                ", room='" + room + '\'' +
                ", rows='" + rows + '\'' +
                ", rowStart='" + rowStart + '\'' +
                ", rowEnd='" + rowEnd + '\'' +
                '}';
    }
}
