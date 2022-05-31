package com.aavvservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "TramitesAAVV")
public class Tramite {

    private String id;
    private String tsAAVV;
    private String tsInsertPending;
    private String tsInsertCompleted;
    private String pagename;
    private String tipoTramite;
    private Object datosTramite;

    public Tramite() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTsAAVV() {
        return tsAAVV;
    }

    public void setTsAAVV(String tsAAVV) {
        this.tsAAVV = tsAAVV;
    }

    public String getTsInsertPending() {
        return tsInsertPending;
    }

    public void setTsInsertPending(String tsInsertPending) {
        this.tsInsertPending = tsInsertPending;
    }

    public String getTsInsertCompleted() {
        return tsInsertCompleted;
    }

    public void setTsInsertCompleted(String tsInsertCompleted) {
        this.tsInsertCompleted = tsInsertCompleted;
    }

    public String getPagename() {
        return pagename;
    }

    public void setPagename(String pagename) {
        this.pagename = pagename;
    }

    public String getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public Object getDatosTramite() {
        return datosTramite;
    }

    public void setDatosTramite(Object datosTramite) {
        this.datosTramite = datosTramite;
    }

    @Override
    public String toString() {
        return "{" +
                "\"id\":\"" + id + "\"," +
                "\"tsAAVV\":\"" + tsAAVV + "\"," +
                "\"tsInsertPending\":" + tsInsertPending + "," +
                "\"tsInsertCompleted\":\"" + tsInsertCompleted + "\"," +
                "\"pagename\":\"" + pagename + "\"," +
                "\"tipoTramite\":\"" + tipoTramite + "\"," +
                "\"datosTramite\":" + datosTramite.toString() +
                "}";
    }
}
