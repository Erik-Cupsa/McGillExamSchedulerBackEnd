package com.mcgill.examscheduler.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
//            return examService.invalidEntry(className);
        }
    }
}
