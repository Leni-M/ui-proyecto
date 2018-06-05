package com.dh.project.demo.repository;

import com.dh.project.demo.domain.AsignarTarea;
import com.dh.project.demo.domain.Student;
import com.dh.project.demo.domain.Tarea;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AsignarTareaRepository extends MongoRepository<AsignarTarea,Long> {



}
