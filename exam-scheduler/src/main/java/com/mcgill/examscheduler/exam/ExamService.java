package com.mcgill.examscheduler.exam;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class ExamService {
    @GetMapping
    public List<Exam> getExams(){
        return List.of(
                new Exam(
                )
        );
    }
}
