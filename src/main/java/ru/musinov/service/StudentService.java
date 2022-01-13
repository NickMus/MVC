package ru.musinov.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.musinov.entities.Student;
import ru.musinov.repo.Repo;

import java.util.List;

@Service
public class StudentService {

    private Repo repo;

    @Autowired
    public void setRepo(Repo repo) {
        this.repo = repo;
    }

    public void addStudentToRepo(Student student) {
        repo.addToRepo(student);
    }

    public void removeFromRepo(Student student) {
        repo.deleteFromRepo(student);
    }
    public List<Student> getAllStudents() {
        return repo.getStudentList();
    }
}
