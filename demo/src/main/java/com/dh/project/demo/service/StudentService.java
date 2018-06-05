package com.dh.project.demo.service;

import com.dh.project.demo.domain.Student;
import com.dh.project.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private static final List<Student> listStudent = new ArrayList<>();
    @Autowired
    private StudentRepository studentRepository;
    // CRUD
    // List student
    public List<Student> getAllStudents(){
        //get all documents from collection teacher
        return studentRepository.findAll();

        // get all teacher from DB
        //return listTeacher;
    }
    // Add new Student
    public void addNewStudent(Student newStudent){
        // insert new Teacher into DB
        studentRepository.save(newStudent);
        //listTeacher.add( newTeacher);
    }
/*
    // Delete Stundet by Id
    @Deprecated
    public void deleteStudent(String id){
        // delete a teacher by id in DB
        listStudent.remove(id);
    }
*/
    public void deleteStudent(long id){
        // delete a teacher by id in DB
        studentRepository.delete(id);
        //listTeacher.remove(id);
    }

    // Get a stydent By Id
    /*
    public Student getStudentById(long id){
        // get a Teacher by id from DB
        return listStudent.get(id);
    }
    */
    public Student getStudentById(long id){
        // get a Student by id from DB
        return studentRepository.findOne(id);
        //return listTeacher.get(id);
    }

   //update student
    public void updateStudent(Student studentUpdate){
        studentRepository.save(studentUpdate);
    }

}
