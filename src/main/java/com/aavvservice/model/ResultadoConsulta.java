package com.aavvservice.model;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResultadoConsulta {

    @Id
    private String id;
    private String tsInsert;
    private String tsLastUpdate;
    private String collection;
    private ArrayList<Object> datos;

    public ResultadoConsulta() {}

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

    public List<Object> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Object> datos) {
        this.datos = datos;
    }

    public void addDatos(Object consulta){
        this.datos.add(consulta);
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":\"" + id + "\"," +
                "\"tsInsert\":\"" + tsInsert + "\"," +
                "\"tsLastUpdate\":" + tsLastUpdate + "," +
                "\"collection\":\"" + collection + "\"," +
                "\"datos\":" + Arrays.toString(datos.toArray()) +
                "}";
    }


}