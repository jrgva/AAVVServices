package com.aavvservice.model;

import org.springframework.data.annotation.Id;

public class ConsultaSincrona {

    @Id
    private String id;
    private String tsInsert;
    private String tsLastUpdate;
    private String collection;
    private Object datos;

    public ConsultaSincrona() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTsInsert() {
        return tsInsert;
    }

    public void setTsInsert(String tsInsert) {
        this.tsInsert = tsInsert;
    }

    public String getTsLastUpdate() {
        return tsLastUpdate;
    }

    public void setTsLastUpdate(String tsLastUpdate) {
        this.tsLastUpdate = tsLastUpdate;
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
                "\"tsInsert\":\"" + tsInsert + "\"," +
                "\"tsLastUpdate\":" + tsLastUpdate + "," +
                "\"collection\":\"" + collection + "\"," +
                "\"datos\":" + datos.toString() +
                "}";
    }
}