package com.dh.project.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Tarea {
    @Id
   private long idTarea;
   private String title;
   private String responsive;
   private String priority;

   public Tarea(){

    }

    public Tarea(long idTarea, String title, String responsive, String priority) {
        this.idTarea = idTarea;
        this.title = title;
        this.responsive = responsive;
        this.priority = priority;
    }

    public long getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(long idTarea) {
        this.idTarea = idTarea;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getResponsive() {
        return responsive;
    }

    public void setResponsive(String responsive) {
        this.responsive = responsive;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
