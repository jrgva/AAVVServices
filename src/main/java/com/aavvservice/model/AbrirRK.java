package com.aavvservice.model;

import org.springframework.validation.annotation.Validated;

import java.util.List;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Validated
public class AbrirRK {
    @NotBlank(message = "Se requiere el documento del cliente")
    private String documento;
    @NotBlank(message = "Se requiere el tipo de documento del cliente")
    private String tipoDocumento;
    @Size(min=0, max=1500, message = "El comentario de cliente no puede exceder los 1500 caracteres")
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
