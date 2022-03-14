package com.aavvservice.model;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Validated
public class RealizarActuacionEyPO {

    @NotBlank(message = "Se requiere el documento del cliente")
    private String documento;
    @NotBlank(message = "Se requiere el tipo de documento del cliente")
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
