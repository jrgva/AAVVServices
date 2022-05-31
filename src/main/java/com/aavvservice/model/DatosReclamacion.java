package com.aavvservice.model;

public class DatosReclamacion {

    private String factura;
    private String fechaEmision;
    private String linea;
    private String producto;
    private String motivo;
    private String submotivo;
    private String importe;
    private String tablaEyPO;
    private String indiceSuscripcion;
    private String eypo;
    private String tipoSuscripcion;
    private String cancelar;
    private String devolver;
    private String bloquear;
    private String tipoBloqueo;
    private String importeMaxEyPO;
    private String importeFacturaEyPO;
    private String importeVueloEyPO;

    public DatosReclamacion() {
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
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

    public String getTablaEyPO() {
        return tablaEyPO;
    }

    public void setTablaEyPO(String tablaEyPO) {
        this.tablaEyPO = tablaEyPO;
    }

    public String getIndiceSuscripcion() {
        return indiceSuscripcion;
    }

    public void setIndiceSuscripcion(String indiceSuscripcion) {
        this.indiceSuscripcion = indiceSuscripcion;
    }

    public String getEypo() {
        return eypo;
    }

    public void setEypo(String eypo) {
        this.eypo = eypo;
    }

    public String getTipoSuscripcion() {
        return tipoSuscripcion;
    }

    public void setTipoSuscripcion(String tipoSuscripcion) {
        this.tipoSuscripcion = tipoSuscripcion;
    }

    public String getCancelar() {
        return cancelar;
    }

    public void setCancelar(String cancelar) {
        this.cancelar = cancelar;
    }

    public String getDevolver() {
        return devolver;
    }

    public void setDevolver(String devolver) {
        this.devolver = devolver;
    }

    public String getBloquear() {
        return bloquear;
    }

    public void setBloquear(String bloquear) {
        this.bloquear = bloquear;
    }

    public String getTipoBloqueo() {
        return tipoBloqueo;
    }

    public void setTipoBloqueo(String tipoBloqueo) {
        this.tipoBloqueo = tipoBloqueo;
    }

    public String getImporteMaxEyPO() {
        return importeMaxEyPO;
    }

    public void setImporteMaxEyPO(String importeMaxEyPO) {
        this.importeMaxEyPO = importeMaxEyPO;
    }

    public String getImporteFacturaEyPO() {
        return importeFacturaEyPO;
    }

    public void setImporteFacturaEyPO(String importeFacturaEyPO) {
        this.importeFacturaEyPO = importeFacturaEyPO;
    }

    public String getImporteVueloEyPO() {
        return importeVueloEyPO;
    }

    public void setImporteVueloEyPO(String importeVueloEyPO) {
        this.importeVueloEyPO = importeVueloEyPO;
    }

    @Override
    public String toString() {
        return "{" +
                "\"factura\":\"" + factura + "\"," +
                "\"fechaEmision\":\"" + fechaEmision + "\"," +
                "\"linea\":\"" + linea + "\"," +
                "\"producto\":\"" + producto + "\"," +
                "\"motivo\":\"" + motivo + "\"," +
                "\"submotivo\":\"" + submotivo + "\"," +
                "\"importe\":\"" + importe + "\"," +
                "\"tablaEyPO\":\"" + tablaEyPO + "\"," +
                "\"indiceSuscripcion\":\"" + indiceSuscripcion + "\"," +
                "\"eypo\":\"" + eypo + "\"," +
                "\"tipoSuscripcion\":\"" + tipoSuscripcion + "\"," +
                "\"cancelar\":\"" + cancelar + "\"," +
                "\"devolver\":\"" + devolver + "\"," +
                "\"bloquear\":\"" + bloquear + "\"," +
                "\"tipoBloqueo\":\"" + tipoBloqueo + "\"," +
                "\"importeMaxEyPO\":\"" + importeMaxEyPO + "\"," +
                "\"importeFacturaEyPO\":\"" + importeFacturaEyPO + "\"," +
                "\"importeVueloEyPO\":\"" + importeVueloEyPO + "\"" +
                "}";
    }
}

