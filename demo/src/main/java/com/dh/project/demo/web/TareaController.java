package com.dh.project.demo.web;

import com.dh.project.demo.domain.Tarea;
import com.dh.project.demo.service.TareaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class TareaController {
@Autowired
    private TareaService tareaService;

    @RequestMapping(method = RequestMethod.GET,value="/tareas")
    public List<Tarea> getAllTareas(){
        return tareaService.getAllTask();
    }


    @RequestMapping(path = "/{id}",method = RequestMethod.GET)
    public Tarea getAllTasks(long id){
        return tareaService.getTareaById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addNewTask(Tarea newTarea){
        tareaService.addNewTarea(newTarea);
    }
    @RequestMapping(path = "/{id}",method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable long id){
        tareaService.deleteTarea(id);
    }
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteById(@RequestBody Tarea tarea){
        tareaService.deleteTarea(tarea.getIdTarea());
    }
    @RequestMapping(method = RequestMethod.PATCH)
    public void updateTarea(Tarea updateTarea){
        tareaService.updateTarea(updateTarea);
    }
}
