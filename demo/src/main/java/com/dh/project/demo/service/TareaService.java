package com.dh.project.demo.service;

import com.dh.project.demo.domain.Tarea;

import com.dh.project.demo.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TareaService {

    private static final List<Tarea> listTarea=new ArrayList<>();
    @Autowired
    private TareaRepository tareaRepository;

    public TareaService(){
        listTarea.add(new Tarea(0,"Tarea 1","Juan","alta"));
        listTarea.add(new Tarea(1,"Tarea 2","Maria","baja"));
        listTarea.add(new Tarea(2,"Tarea 3","Ana","media"));
        listTarea.add(new Tarea(3,"Tarea 4","Luis","alta"));
    }
    public void addNewTarea(Tarea newTarea){
        tareaRepository.save(newTarea);
    }
    public List<Tarea> getAllTask(){
        return tareaRepository.findAll();
    }
    public void deleteTarea(long id){
        tareaRepository.delete(id);
    }
    public Tarea getTareaById(long id){
        return tareaRepository.findOne(id);
    }
    public void updateTarea(Tarea updateTarea){
        tareaRepository.save(updateTarea);
    }
}
