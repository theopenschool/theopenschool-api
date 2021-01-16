package com.openschool.api.exam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExamController {

    private ExamRepository examRepository;

    public ExamController(ExamRepository examRepository){
        this.examRepository = examRepository;
    }

    @GetMapping("/exams")
    public List<Exam> get(){
        return examRepository.findAll();
    }

    @PostMapping("/exams")
    public Exam create(@RequestBody Exam exam){
        return examRepository.save(exam);
    }

}
