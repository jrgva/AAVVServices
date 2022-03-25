package com.aavvservice.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Arrays;
import java.util.List;

public class RealizarActuacionEyPO {

    @Pattern(regexp = "(19|20)[0-9][0-9]-(0[0-9]|1[0-2])-(0[1-9]|([12][0-9]|3[01]))T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]:[0-9][0-9][0-9]Z", message = "tsAAVV tiene que estar en el formato yyyy-MM-ddThh:mm:ss:SSSZ")
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
        return "{" +
                "\"tsAAVV\":\"" + tsAAVV + "\"," +
                "\"documento\":\"" + documento + "\"," +
                "\"tipoDocumento\":\"" + tipoDocumento + "\"," +
                "\"datosActuacionEyPO\":" + Arrays.toString(datosActuacionEyPO.toArray()) +
                "}";
    }
}
