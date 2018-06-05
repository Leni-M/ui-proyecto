package com.dh.project.demo.web;

import com.dh.project.demo.domain.Teacher;
import com.dh.project.demo.service.TeacherService;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class TeacherController {
    // dependency Injection
    @Autowired
    private TeacherService teacherService;
    // Get all teachers
    @RequestMapping(method = RequestMethod.GET)
    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }

    @RequestMapping(path="/{id}",method = RequestMethod.GET)
    public Teacher getTeacherById(@PathVariable String id){
        return teacherService.getTeacherById(id);
        //return teacherService.getTeacherById(id);
    }
    // insert new Teacher
    @RequestMapping(method = RequestMethod.POST)
    public void addNewTeacher(@RequestBody Teacher newTeacher){
        System.out.println("the Name of new Teacher is "+newTeacher.getName());
        teacherService.addNewTeacher(newTeacher);
    }
    // delete Teacher : localhost:9090/teacher/2
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void deleteTeacher(@PathVariable long id){
        System.out.println("the Id delete is " + id);
        teacherService.deleteTeacher(id);
        //teacherService.deleteTeacher(id);
    }

    // delete Teacher by Id using Request Body
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteTeacherByRequ(@RequestBody Teacher teacher){
        System.out.println("the id of teacher to delete is "+ teacher.getCi());
        teacherService.deleteTeacher(teacher.getId());
        //teacherService.deleteTeacher((int)teacher.getCi());
    }
    @RequestMapping(method = RequestMethod.PATCH)
    public void updateTeacher(@RequestBody Teacher updateTeacher){//mapear @RequestBody
        teacherService.updateTeacher(updateTeacher);
    }
}
