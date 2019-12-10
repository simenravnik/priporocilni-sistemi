package si.fri.prpo.sistemi.baza;

public class Artikel implements Comparable<Artikel> {

    private String imeArtikla;
    private Integer value;

    public Artikel() {}

    public Artikel(Integer value, String imeArtikla) {
        this.imeArtikla = imeArtikla;
        this.value = value;
    }

    public String getImeArtikla() {
        return imeArtikla;
    }

    public void setImeArtikla(String imeArtikla) {
        this.imeArtikla = imeArtikla;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public int compareTo(Artikel a) {
        return this.getValue().compareTo(a.getValue());
    }

}
