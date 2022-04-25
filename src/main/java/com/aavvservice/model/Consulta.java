package com.aavvservice.model;

import org.springframework.data.annotation.Id;

public class Consulta {

    @Id
    private String id;
    private String collection;
    private Object datos;

    public Consulta() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public Object getDatos() {
        return datos;
    }

    public void setDatos(Object datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":\"" + id + "\"," +
                "\"collection\":\"" + collection + "\"," +
                "\"datos\":" + datos.toString() +
                "}";
    }
}