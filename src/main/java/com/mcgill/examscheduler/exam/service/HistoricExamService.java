package com.mcgill.examscheduler.exam.service;

import com.mcgill.examscheduler.exam.model.HistoricExam;
import com.mcgill.examscheduler.exam.repo.HistoricExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class HistoricExamService {
    private final HistoricExamRepository historicExamRepository;

    @Autowired
    public HistoricExamService(HistoricExamRepository historicExamRepository) {
        this.historicExamRepository = historicExamRepository;
    }

    public List<HistoricExam> getExamsByNameAndYear(List<String> classNames, List<String> years) {
        List<String> lowercaseHistoricExamNames = classNames.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        List<String> lowercaseYears = years.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        // Filter exams by class names provided in the list
        return historicExamRepository.findAll().stream()
                .filter(historicExam -> lowercaseHistoricExamNames.contains(historicExam.getCourse().toLowerCase())
                        && lowercaseYears.contains(historicExam.getYear().toLowerCase()))
                .collect(Collectors.toList());
    }
}
