package com.aavvservice.model;

public class Tramite {

    private String id;
    private String fechaCreacion;
    private boolean procesado;
    private String documento;
    private String tipoDocumento;
    private String tipoTramite;
    private Object datosTramite;

    public Tramite() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
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

    public String getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public Object getDatosTramite() {
        return datosTramite;
    }

    public void setDatosTramite(Object datosTramite) {
        this.datosTramite = datosTramite;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                ", procesado=" + procesado +
                ", documento='" + documento + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", tipoTramite='" + tipoTramite + '\'' +
                ", datosTramite=" + datosTramite +
                '}';
    }
}
