package com.mcgill.examscheduler.exam.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "historic_exams")
@IdClass(Historic_Exams_Key.class)
public class Historic_Exams {
    @Id
    @Column(name = "course")
    private String course;
    @Id
    @Column(name = "section")
    private String section;
    @Id
    @Column(name = "year")
    private String year;
    private String course_title;
    private String exam_type;
    private LocalDateTime exam_start_time;
    private LocalDateTime exam_end_time;
    private String building;
    private String room;
    private String rows_from;
    private String row_start;
    private String row_end;

    public Historic_Exams(String course, String section, String year, String course_title, String exam_type, LocalDateTime exam_start_time, LocalDateTime exam_end_time, String building, String room, String rows_from, String row_start, String row_end) {
        this.course = course;
        this.section = section;
        this.year = year;
        this.course_title = course_title;
        this.exam_type = exam_type;
        this.exam_start_time = exam_start_time;
        this.exam_end_time = exam_end_time;
        this.building = building;
        this.room = room;
        this.rows_from = rows_from;
        this.row_start = row_start;
        this.row_end = row_end;
    }

    public Historic_Exams(){

    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCourse_title() {
        return course_title;
    }

    public void setCourse_title(String course_title) {
        this.course_title = course_title;
    }

    public String getExam_type() {
        return exam_type;
    }

    public void setExam_type(String exam_type) {
        this.exam_type = exam_type;
    }

    public LocalDateTime getExam_start_time() {
        return exam_start_time;
    }

    public void setExam_start_time(LocalDateTime exam_start_time) {
        this.exam_start_time = exam_start_time;
    }

    public LocalDateTime getExam_end_time() {
        return exam_end_time;
    }

    public void setExam_end_time(LocalDateTime exam_end_time) {
        this.exam_end_time = exam_end_time;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRows_from() {
        return rows_from;
    }

    public void setRows_from(String rows_from) {
        this.rows_from = rows_from;
    }

    public String getRow_start() {
        return row_start;
    }

    public void setRow_start(String row_start) {
        this.row_start = row_start;
    }

    public String getRow_end() {
        return row_end;
    }

    public void setRow_end(String row_end) {
        this.row_end = row_end;
    }
}
