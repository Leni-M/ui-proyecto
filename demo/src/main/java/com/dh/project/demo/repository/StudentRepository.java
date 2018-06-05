package com.dh.project.demo.repository;

import com.dh.project.demo.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

    Student findOne(long idStudent);

    void delete(long id);
}
