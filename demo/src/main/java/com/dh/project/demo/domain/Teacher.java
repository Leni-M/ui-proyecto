package com.dh.project.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Teacher {
    //para que no muestre el id
    //@Transient
    @Id
    private long id;
    private  long ci;

    private  String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    // fix error adding default constructor
    public Teacher(){

    }

    public Teacher(long id, long ci, String name) {
        this.id = id;
        this.ci = ci;
        this.name = name;
    }

    public long getCi() {
        return ci;
    }

    public void setCi(long ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
