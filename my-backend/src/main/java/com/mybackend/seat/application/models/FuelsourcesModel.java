package com.mybackend.seat.application.models;

import java.util.List;

public class FuelsourcesModel {

    //--- Attributes -----------------------------------------------
    public long id;
    public String name;
    public String description;

    //--- Constructor ----------------------------------------------
    public FuelsourcesModel() {
    }

    //--- Getters & Setters ----------------------------------------
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
