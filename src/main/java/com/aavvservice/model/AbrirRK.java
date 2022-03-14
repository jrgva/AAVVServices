package com.aavvservice.model;

import java.util.List;

public class AbrirRK {

    private String documento;
    private String tipoDocumento;
    private String comentarioCliente;
    private List<DatosReclamacion> datosReclamacion;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getComentarioCliente() {
        return comentarioCliente;
    }

    public void setComentarioCliente(String comentarioCliente) {
        this.comentarioCliente = comentarioCliente;
    }

    public List<DatosReclamacion> getDatosReclamacion() {
        return datosReclamacion;
    }

    public void setDatosReclamacion(List<DatosReclamacion> datosReclamacion) {
        this.datosReclamacion = datosReclamacion;
    }

    @Override
    public String toString() {
        return "{" +
                "documento='" + documento + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", comentarioCliente='" + comentarioCliente + '\'' +
                ", datosReclamacion=" + datosReclamacion +
                '}';
    }
}
