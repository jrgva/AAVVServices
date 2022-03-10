package com.aavvservice.model;

public class DatosActuacionEyPO {

    private String linea;
    private String suscripcion;
    private String bloqueo;
    private String baja;

    public DatosActuacionEyPO() {
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }

    public String getBloqueo() {
        return bloqueo;
    }

    public void setBloqueo(String bloqueo) {
        this.bloqueo = bloqueo;
    }

    public String getBaja() {
        return baja;
    }

    public void setBaja(String baja) {
        this.baja = baja;
    }

    @Override
    public String toString() {
        return "datosActuacionEyPO{" +
                "linea='" + linea + '\'' +
                ", suscripcion='" + suscripcion + '\'' +
                ", bloqueo='" + bloqueo + '\'' +
                ", baja='" + baja + '\'' +
                '}';
    }
}
