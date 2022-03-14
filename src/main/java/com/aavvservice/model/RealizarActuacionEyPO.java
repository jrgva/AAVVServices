package com.aavvservice.model;

import java.util.List;

public class RealizarActuacionEyPO {

    private String documento;
    private String tipoDocumento;
    private List<DatosActuacionEyPO> datosActuacionEyPO;

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

    public List<DatosActuacionEyPO> getDatosGestion() {
        return datosActuacionEyPO;
    }

    public void setDatosGestion(List<DatosActuacionEyPO> datosActuacionEyPO) {
        this.datosActuacionEyPO = datosActuacionEyPO;
    }

    @Override
    public String toString() {
        return "{" +
                "documento='" + documento + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", datosActuacionEyPO=" + datosActuacionEyPO +
                '}';
    }
}
