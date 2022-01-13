package ru.musinov.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.musinov.entities.Student;
import ru.musinov.service.StudentService;

@Controller
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService student) {
        this.studentService = student;
    }


    @RequestMapping("/show_form")
    public String showForm(Model uiModel) {
        Student student = new Student();
        uiModel.addAttribute("student", student);
        return "student_form";
    }

    @RequestMapping("/processForm")
    public String showResult(@ModelAttribute("student") Student student) {
        studentService.addStudentToRepo(student);
        return "student_list";
    }

    @RequestMapping("/showAllStudents")
    public String showAllStudents(Model uiModel) {
        uiModel.addAttribute("studentList", studentService.getAllStudents());
        return "all_students";
    }

}
