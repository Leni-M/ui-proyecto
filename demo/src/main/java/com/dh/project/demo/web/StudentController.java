package com.dh.project.demo.web;

import com.dh.project.demo.domain.Student;
import com.dh.project.demo.service.StudentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class StudentController {
    // dependency Injection
    @Autowired
    private StudentService studentService;

    // Get all teachers
    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable long id) {
        return studentService.getStudentById(id);
        //return teacherService.getTeacherById(id);
    }

    // insert new Teacher
    @RequestMapping(method = RequestMethod.POST)
    public void addNewStudent(@RequestBody Student newStudent) {
        System.out.println("the Name of new Teacher is " + newStudent.getName());
        studentService.addNewStudent(newStudent);
    }

    // delete Teacher : localhost:9090/teacher/2
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable long id) {
        System.out.println("the Id delete is " + id);
        studentService.deleteStudent(id);
        //teacherService.deleteTeacher(id);
    }

    // delete Teacher by Id using Request Body
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteStudentByRequ(@RequestBody Student student) {
        System.out.println("the id of teacher to delete is " + student.getCi());
        studentService.deleteStudent(student.getId());
        //teacherService.deleteTeacher((int)student.getCi());
    }
    @RequestMapping(method = RequestMethod.PATCH)
    public void updateStudent(@RequestBody Student updateStudent){//mapear @RequestBody
        studentService.updateStudent(updateStudent);
    }
}
