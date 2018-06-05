package com.dh.project.demo.service;

import com.dh.project.demo.domain.AsignarTarea;
import com.dh.project.demo.domain.Student;
import com.dh.project.demo.domain.Tarea;
import com.dh.project.demo.domain.Teacher;
import com.dh.project.demo.repository.AsignarTareaRepository;
import com.dh.project.demo.repository.StudentRepository;
import com.dh.project.demo.repository.TareaRepository;

import com.dh.project.demo.repository.TeacherRepository;
import com.dh.project.demo.web.AsignarTareaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class AsignarTareaService {

    @Autowired
    private AsignarTareaRepository asignarTareaRepository;
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private TareaRepository tareaRepository;
    @Autowired
    private StudentRepository studentRepository;

    public List<AsignarTarea> getAllAsignarTareas(){
        return asignarTareaRepository.findAll();
    }
    public Iterator<AsignarTarea> getAll(){
        return (Iterator<AsignarTarea>) asignarTareaRepository.findAll();
    }


    public  void addNewAsignarTarea(AsignarTareaController.AsignarTareaDTO asignarTareaDTO){
        AsignarTarea newAsignarTarea=new AsignarTarea();

        newAsignarTarea.setStudent(asignarTareaDTO.getStudent());
        newAsignarTarea.setTeacher(asignarTareaDTO.getTeacher());
        newAsignarTarea.setTarea(asignarTareaDTO.getTarea());
        newAsignarTarea.setNameTarea(asignarTareaDTO.getNombre());

        asignarTareaRepository.save(newAsignarTarea);
    }
    /*
    public void deleteAsignarTarea(AsignarTareaController.AsignarTareaDTO asignarTareaDTO){
        AsignarTarea delAsignarTarea=new AsignarTarea();
        Student delStudent=studentRepository.findOne(asignarTareaDTO.getIdStudent());
        Teacher delTeacher=teacherRepository.findOne(asignarTareaDTO.getIdTeacher());
        Tarea delTarea=tareaRepository.findOne(asignarTareaDTO.getIdTarea());

        delAsignarTarea.setStudent(delStudent);
        delAsignarTarea.setTeacher(delTeacher);
        delAsignarTarea.setTarea(delTarea);
        delAsignarTarea.setNameTarea(asignarTareaDTO.getNombre());

        asignarTareaRepository.delete(delAsignarTarea);
    }*/

    public void deleteById(long id){
        AsignarTarea delAs=asignarTareaRepository.findOne(id);
        asignarTareaRepository.delete(delAs);
    }
}
