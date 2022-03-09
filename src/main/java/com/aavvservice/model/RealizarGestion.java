package com.aavvservice.model;

import java.util.List;

public class RealizarGestion {

    private String documento;
    private String tipoDocumento;
    private List<DatosGestion> datosGestion;

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

    public List<DatosGestion> getDatosGestion() {
        return datosGestion;
    }

    public void setDatosGestion(List<DatosGestion> datosGestion) {
        this.datosGestion = datosGestion;
    }

    @Override
    public String toString() {
        return "realizarGestion{" +
                "documento='" + documento + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", datosGestion=" + datosGestion +
                '}';
    }
}
