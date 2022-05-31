package com.aavvservice.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.Arrays;

public class RealizarActuacionEyPO {

    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}Z", message = "tsAAVV tiene que estar en el formato yyyy-MM-ddThh:mm:ss:SSSZ")
    private String tsAAVV;
    @NotBlank(message = "Se requiere el documento del cliente")
    private String documento;
    @NotBlank(message = "Se requiere el tipo de documento del cliente")
    private String tipoDocumento;
    private ArrayList<DatosActuacionEyPO> datosActuacionEyPO;

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

    public ArrayList<DatosActuacionEyPO> getDatosActuacionEyPO() {
        return datosActuacionEyPO;
    }

    public void setDatosActuacionEyPO(ArrayList<DatosActuacionEyPO> datosActuacionEyPO) {
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