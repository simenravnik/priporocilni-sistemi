package si.fri.prpo.sistemi.dto;

public class ArtikelDto {

    private Long seznamId;
    private String imeArtikla;

    public ArtikelDto() {}

    public ArtikelDto(Long seznamId, String imeArtikla) {
        this.seznamId = seznamId;
        this.imeArtikla = imeArtikla;
    }

    public Long getSeznamId() {
        return seznamId;
    }

    public void setSeznamId(Long seznamId) {
        this.seznamId = seznamId;
    }

    public String getImeArtikla() {
        return imeArtikla;
    }

    public void setImeArtikla(String imeArtikla) {
        this.imeArtikla = imeArtikla;
    }
}
