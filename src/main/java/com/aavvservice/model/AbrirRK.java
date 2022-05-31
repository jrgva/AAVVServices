package com.aavvservice.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Arrays;

public class AbrirRK {

    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}\\.\\d{3}Z", message = "El timestamp tiene que estar en el formato yyyy-MM-ddThh:mm:ss.SSSZ")
    private String tsAAVV;
    @NotBlank(message = "Se requiere el documento del cliente")
    private String documento;
    @NotBlank(message = "Se requiere el tipo de documento del cliente")
    private String tipoDocumento;
    @Size(max = 1500, message = "El comentario de cliente no puede exceder los 1500 caracteres")
    private String comentarioCliente;
    private String restriccionConCoste;
    private ArrayList<DatosReclamacion> datosReclamacion;

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

    public String getRestriccionConCoste() {
        return restriccionConCoste;
    }

    public void setRestriccionConCoste(String restriccionConCoste) {
        this.restriccionConCoste = restriccionConCoste;
    }

    public String getComentarioCliente() {
        return comentarioCliente;
    }

    public void setComentarioCliente(String comentarioCliente) {
        this.comentarioCliente = comentarioCliente;
    }

    public ArrayList<DatosReclamacion> getDatosReclamacion() {
        return datosReclamacion;
    }

    public void setDatosReclamacion(ArrayList<DatosReclamacion> datosReclamacion) {
        this.datosReclamacion = datosReclamacion;
    }

    @Override
    public String toString() {
        return "{" +
                "\"tsAAVV\":\"" + tsAAVV + "\"," +
                "\"documento\":\"" + documento + "\"," +
                "\"tipoDocumento\":\"" + tipoDocumento + "\"," +
                "\"comentarioCliente\":\"" + comentarioCliente + "\"," +
                "\"restriccionConCoste\":\"" + restriccionConCoste + "\"," +
                "\"datosReclamacion\":" + Arrays.toString(datosReclamacion.toArray()) +
                "}";
    }
}
