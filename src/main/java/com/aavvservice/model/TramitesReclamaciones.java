package com.aavvservice.model;

import java.util.Date;
import java.util.List;

public class TramitesReclamaciones {

    private String id;
    private Date fechaCreacion;
    private boolean procesado;
    private String documento;
    private String tipoDocumento;
    private String comentarioCliente;
    private String tipoTramite;
    private List<DatosReclamacion> datosReclamacion;
    private List<DatosActuacionEyPO> datosActuacionEyPO;

    public TramitesReclamaciones() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public boolean isProcesado() {
        return procesado;
    }

    public void setProcesado(boolean procesado) {
        this.procesado = procesado;
    }

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

    public String getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public List<DatosReclamacion> getDatosReclamacion() {
        return datosReclamacion;
    }

    public void setDatosReclamacion(List<DatosReclamacion> datosReclamacion) {
        this.datosReclamacion = datosReclamacion;
    }

    public List<DatosActuacionEyPO> getDatosGestiones() {
        return datosActuacionEyPO;
    }

    public void setDatosGestion(List<DatosActuacionEyPO> datosActuacionEyPO) {
        this.datosActuacionEyPO = datosActuacionEyPO;
    }

    @Override
    public String toString() {
        return "tramitesReclamaciones{" +
                "id='" + id + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", procesado=" + procesado +
                ", documento='" + documento + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", comentarioCliente='" + comentarioCliente + '\'' +
                ", tipoTramite='" + tipoTramite + '\'' +
                ", datosReclamacion=" + datosReclamacion +
                ", datosActuacionEyPO=" + datosActuacionEyPO +
                '}';
    }
}
