package sistema_iptu;

public class Chacara {
    private Municipio municipio;
    private Double areaM2;
    private Integer vagas;
    private Boolean possuiPocoArtesanal;

    public Double calcularIPTU(){
        return this.areaM2 * this.municipio.getPrecoM2();
    }

    public Chacara(Municipio municipio, Double areaM2, Integer vagas, Boolean possuiPocoArtesanal) {
        this.municipio = municipio;
        this.areaM2 = areaM2;
        this.vagas = vagas;
        this.possuiPocoArtesanal = possuiPocoArtesanal;
    }


    public Municipio getMunicipio() {
        return this.municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Double getAreaM2() {
        return this.areaM2;
    }

    public void setAreaM2(Double areaM2) {
        this.areaM2 = areaM2;
    }

    public Integer getVagas() {
        return this.vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public Boolean isPossuiPocoArtesanal() {
        return this.possuiPocoArtesanal;
    }

    public Boolean getPossuiPocoArtesanal() {
        return this.possuiPocoArtesanal;
    }

    public void setPossuiPocoArtesanal(Boolean possuiPocoArtesanal) {
        this.possuiPocoArtesanal = possuiPocoArtesanal;
    }


}
