package com.dh.project.demo.repository;

import com.dh.project.demo.domain.Tarea;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TareaRepository extends MongoRepository<Tarea,Long> {
}
