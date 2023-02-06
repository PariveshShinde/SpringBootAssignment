package com.xadmin.SpringBootCrud.repository;

import com.xadmin.SpringBootCrud.bean.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,String> {
}
