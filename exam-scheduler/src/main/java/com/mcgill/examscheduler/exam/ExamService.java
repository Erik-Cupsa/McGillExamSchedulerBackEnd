package com.mcgill.examscheduler.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ExamService {
    private final ExamRepository examRepository;

    @Autowired
    public ExamService(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }

    public List<Exam> getExams(){
       return examRepository.findAll();
    }

    public List<Exam> getExamsByClass(String className) {
        return examRepository.findAll().stream()
                .filter(exam -> exam.getCourse().toLowerCase().contains(className.toLowerCase()))
                .collect(Collectors.toList());
    }

//    public List<Exam> invalidEntry(String className) {
//    }
}
