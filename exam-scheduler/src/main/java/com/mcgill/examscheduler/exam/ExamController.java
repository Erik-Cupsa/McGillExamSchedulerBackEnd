package com.mcgill.examscheduler.exam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/exam")
public class ExamController {
    @GetMapping
    public List<Exam> getExams(){
        return List.of(
                new Exam(
                )
        );
    }
}
