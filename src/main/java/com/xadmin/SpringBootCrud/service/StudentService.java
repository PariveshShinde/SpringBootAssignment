package com.xadmin.SpringBootCrud.service;

import com.xadmin.SpringBootCrud.bean.Student;
import com.xadmin.SpringBootCrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    public StudentRepository studentRepo;
    public List<Student> getAllStudents(){
        List<Student> students=new ArrayList<>();
        studentRepo.findAll().forEach(students::add);
        return students;
    }

    public void addStudent(Student student) {
        studentRepo.save(student);
        return;
    }

    public void updateStudent(Student student) {
        studentRepo.save(student);
    }

    public void deleteStudent(String id) {
        studentRepo.deleteById(id);
    }
}
