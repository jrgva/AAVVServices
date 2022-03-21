package com.aavvservice.model;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import java.util.Arrays;
import java.util.List;

@Validated
public class RealizarActuacionEyPO {

    private String tsAAVV;
    @NotBlank(message = "Se requiere el documento del cliente")
    private String documento;
    @NotBlank(message = "Se requiere el tipo de documento del cliente")
    private String tipoDocumento;
    private List<DatosActuacionEyPO> datosActuacionEyPO;

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

    public List<DatosActuacionEyPO> getDatosActuacionEyPO() {
        return datosActuacionEyPO;
    }

    public void setDatosActuacionEyPO(List<DatosActuacionEyPO> datosActuacionEyPO) {
        this.datosActuacionEyPO = datosActuacionEyPO;
    }

    @Override
    public String toString() {
        return  "{" +
                "\"tsAAVV\":\"" + tsAAVV + "\"," +
                "\"documento\":\"" + documento + "\"," +
                "\"tipoDocumento\":\"" + tipoDocumento + "\"," +
                "\"datosActuacionEyPO\":" + Arrays.toString(datosActuacionEyPO.toArray()) +
                "}";
    }
}
