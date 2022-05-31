package com.aavvservice.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class FraccionarFacturas {

    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}Z", message = "tsAAVV tiene que estar en el formato yyyy-MM-ddThh:mm:ss.SSSZ")
    private String tsAAVV;
    @NotBlank(message = "Se requiere el documento del cliente")
    private String documento;
    @NotBlank(message = "Se requiere el tipo de documento del cliente")
    private String tipoDocumento;
    private String tablaInterlocutores;
    private String sociedadFraccionamiento;
    private String facturasFraccionamiento;

    public String getTsAAVV() {
        return tsAAVV;
    }

    public void setTsAAVV(String tsAAVV) {
        this.tsAAVV = tsAAVV;
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

    public String getTablaInterlocutores() {
        return tablaInterlocutores;
    }

    public void setTablaInterlocutores(String tablaInterlocutores) {
        this.tablaInterlocutores = tablaInterlocutores;
    }

    public String getSociedadFraccionamiento() {
        return sociedadFraccionamiento;
    }

    public void setSociedadFraccionamiento(String sociedadFraccionamiento) {
        this.sociedadFraccionamiento = sociedadFraccionamiento;
    }

    public String getFacturasFraccionamiento() {
        return facturasFraccionamiento;
    }

    public void setFacturasFraccionamiento(String facturasFraccionamiento) {
        this.facturasFraccionamiento = facturasFraccionamiento;
    }

    @Override
    public String toString() {
        return "{" +
                "\"tsAAVV\":\"" + tsAAVV + "\"," +
                "\"documento\":\"" + documento + "\"," +
                "\"tipoDocumento\":\"" + tipoDocumento + "\"," +
                "\"tablaInterlocutores\":" + tablaInterlocutores + "\"," +
                "\"sociedadFraccionamiento\":" + sociedadFraccionamiento + "\"," +
                "\"facturasFraccionamiento\":" + facturasFraccionamiento + "\"" +
                "}";
    }
}
