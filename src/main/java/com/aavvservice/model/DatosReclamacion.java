package com.aavvservice.model;

public class DatosReclamacion {

    private String factura;
    private String linea;
    private String concepto;
    private String motivo;
    private String submotivo;
    private String importe;
    private boolean EyPO;
    private String suscripcion;
    private String bloqueo;
    private String baja;
    private String devolucion;

    public DatosReclamacion() {
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getSubmotivo() {
        return submotivo;
    }

    public void setSubmotivo(String submotivo) {
        this.submotivo = submotivo;
    }

    public String getImporte() {
        return importe;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public boolean isEyPO() {
        return EyPO;
    }

    public void setEyPO(boolean eyPO) {
        EyPO = eyPO;
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

    public String getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(String devolucion) {
        this.devolucion = devolucion;
    }

    @Override
    public String toString() {
        return "{" +
                "\"factura\":\"" + factura + "\"," +
                "\"linea\":\"" + linea + "\"," +
                "\"concepto\":\"" + concepto + "\"," +
                "\"motivo\":\"" + motivo + "\"," +
                "\"submotivo\":\"" + submotivo + "\"," +
                "\"importe\":\"" + importe + "\"," +
                "\"EyPO\":" + EyPO + "," +
                "\"suscripcion\":\"" + suscripcion + "\"," +
                "\"bloqueo\":\"" + bloqueo + "\"," +
                "\"baja\":\"" + baja + "\"," +
                "\"devolucion\":\"" + devolucion + "\"" +
                "}";
    }
}
