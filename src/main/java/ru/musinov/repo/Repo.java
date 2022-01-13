package ru.musinov.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.musinov.entities.Student;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Repo {

    List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addToRepo(Student student) {
        studentList.add(student);
        System.out.println("Student " + student.getName() + " was added to list");
    }

    public void deleteFromRepo(Student student) {
        studentList.remove(student);
    }

    public void getAllStudents() {

    }
}
