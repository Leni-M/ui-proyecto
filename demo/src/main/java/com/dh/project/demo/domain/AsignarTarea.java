package com.dh.project.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class AsignarTarea {
    @Id
    private long id;
    private String nameTarea;

    @DBRef
    private Student student;
    @DBRef
    private Teacher teacher;
    @DBRef
    private Tarea tarea;

    public String getNameTarea() {
        return nameTarea;
    }

    public void setNameTarea(String nameTarea) {
        this.nameTarea = nameTarea;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }



    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }




    public AsignarTarea(){

    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



}
