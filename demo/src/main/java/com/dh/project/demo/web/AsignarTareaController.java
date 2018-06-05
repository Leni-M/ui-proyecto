package com.dh.project.demo.web;


import com.dh.project.demo.domain.AsignarTarea;
import com.dh.project.demo.domain.Student;
import com.dh.project.demo.domain.Tarea;
import com.dh.project.demo.domain.Teacher;
import com.dh.project.demo.service.AsignarTareaService;
import io.swagger.annotations.Api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/asignarTareas")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class AsignarTareaController {

   @Autowired
    private AsignarTareaService asignarTareaService;

    @RequestMapping(method = RequestMethod.GET)
    public List<AsignarTarea> getAllAsignarTareas(){
        return asignarTareaService.getAllAsignarTareas();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewAsignarTarea(@RequestBody AsignarTareaDTO asignarTareasDTO){
        asignarTareaService.addNewAsignarTarea(asignarTareasDTO);
    }
    /*
    @RequestMapping(method = RequestMethod.PATCH)
    public void updateNombreTarea(@RequestBody AsignarTareaDTO asignarTareasDTO){
        //asignarTareaService.updateAsignarTarea(asignarTareasDTO.getNombre());
    }*/
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteAsignarTarea(@RequestBody AsignarTareaDTO asignarTareasDTO){
       String delNameAsignarTarea=asignarTareasDTO.getNombre();
       if(!delNameAsignarTarea.trim().isEmpty()){
           for (AsignarTarea at:getAllAsignarTareas()){
               if(at.getNameTarea().equals(delNameAsignarTarea)){
                   getAllAsignarTareas().remove(at);
                   System.out.println("Delete ..");
               }
           }
       }
    }
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void deleteByID(@PathVariable Long id){
        asignarTareaService.deleteById(id);

    }

    public static class AsignarTareaDTO{
        private String nombre;
        private Student student;
        private Teacher teacher;
        private  Tarea Tarea;


        public Student getStudent() {
            return student;
        }

        public void setStudent(Student student) {
            this.student = student;
        }

        public Teacher getTeacher() {
            return teacher;
        }

        public void setTeacher(Teacher teacher) {
            this.teacher = teacher;
        }

        public com.dh.project.demo.domain.Tarea getTarea() {
            return Tarea;
        }

        public void setTarea(com.dh.project.demo.domain.Tarea tarea) {
            Tarea = tarea;
        }






        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }







    }







}
