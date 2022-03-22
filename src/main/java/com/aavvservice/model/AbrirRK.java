package com.aavvservice.model;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Arrays;
import java.util.List;

@Validated
public class AbrirRK {

    @Pattern(regexp="(19|20)[0-9][0-9]-(0[0-9]|1[0-2])-(0[1-9]|([12][0-9]|3[01]))T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]:[0-5][0-9]Z",message="El timestamp tiene que estar en el formato yyyy-MM-ddThh:mm:ss:SSSZ ")
    private String tsAAVV;
    @NotBlank(message = "Se requiere el documento del cliente")
    private String documento;
    @NotBlank(message = "Se requiere el tipo de documento del cliente")
    private String tipoDocumento;
    @Size(min = 0, max = 1500, message = "El comentario de cliente no puede exceder los 1500 caracteres")
    private String comentarioCliente;
    private List<DatosReclamacion> datosReclamacion;

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

    public String getComentarioCliente() {
        return comentarioCliente;
    }

    public void setComentarioCliente(String comentarioCliente) {
        this.comentarioCliente = comentarioCliente;
    }

    public List<DatosReclamacion> getDatosReclamacion() {
        return datosReclamacion;
    }

    public void setDatosReclamacion(List<DatosReclamacion> datosReclamacion) {
        this.datosReclamacion = datosReclamacion;
    }

    @Override
    public String toString() {
        return "{" +
                "\"tsAAVV\":\"" + tsAAVV + "\"," +
                "\"documento\":\"" + documento + "\"," +
                "\"tipoDocumento\":\"" + tipoDocumento + "\"," +
                "\"comentarioCliente\":\"" + comentarioCliente + "\"," +
                "\"datosReclamacion\":" + Arrays.toString(datosReclamacion.toArray()) +
                "}";
    }


}
