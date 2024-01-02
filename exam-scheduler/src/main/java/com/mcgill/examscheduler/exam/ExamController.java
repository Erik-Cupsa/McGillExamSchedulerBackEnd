package com.mcgill.examscheduler.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/exam")
public class ExamController {
    private final ExamService examService;

    @Autowired
    public ExamController(ExamService examService) {
        this.examService = examService;
    }


    @GetMapping
    public List<Exam> getExams(@RequestParam(required = false) String className){

        if (className != null){
            return examService.getExamsByClass(className);
        }
        else{
            return examService.getExams();
        }
    }

    @PostMapping
    public ResponseEntity<Exam> addExam(@RequestBody Exam newExam) {
        Exam createdExam = examService.addExam(newExam);
        return new ResponseEntity<>(createdExam, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Exam> updateExam(@PathVariable String courseName, @RequestBody Exam exam) {
        Exam updatedExam = examService.updateExam(courseName, exam);
        if (updatedExam != null) {
            return new ResponseEntity<>(updatedExam, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
