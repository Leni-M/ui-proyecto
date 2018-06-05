package com.dh.project.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //para que no muestre el id
    //@Transient

    public Student(long id, long ci, String name, String codsis) {
        this.id = id;
        this.ci = ci;
        this.name = name;
        this.codsis = codsis;
    }


    @Id
    private long id;
    private long ci;
    private String name;
    private String codsis;

    public String getCodsis() {
        return codsis;
    }

    public void setCodsis(String codsis) {
        this.codsis = codsis;
    }

    public Student(){

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
