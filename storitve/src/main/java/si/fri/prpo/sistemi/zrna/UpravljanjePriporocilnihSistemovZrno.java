package si.fri.prpo.sistemi.zrna;

import si.fri.prpo.sistemi.baza.Artikel;
import si.fri.prpo.sistemi.dto.ArtikelDto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

@ApplicationScoped
public class UpravljanjePriporocilnihSistemovZrno {

    private Logger log = Logger.getLogger(UpravljanjePriporocilnihSistemovZrno.class.getName());

    private List<Artikel> artikelList;


    @PostConstruct
    private void init() {

        log.info("Inicializacija zrna " + UpravljanjePriporocilnihSistemovZrno.class.getSimpleName());

        artikelList = new LinkedList<>();

    }

    @PreDestroy
    private void destroy() {

        log.info("Deinicializacija zrna " + UpravljanjePriporocilnihSistemovZrno.class.getSimpleName());

    }

    public List<String> pridobiPogosteArtikle() {

        Collections.sort(artikelList, Collections.reverseOrder());

        List<String> artikli = new LinkedList<>();

        int count = 0;
        for (Artikel artikel : artikelList) {
            if(count == 5) {
                break;
            }

            artikli.add(artikel.getImeArtikla());

            count++;
        }

        return artikli;

    }

    public String vstaviArtikel(ArtikelDto artikelDto) {

        String imeArtikla = artikelDto.getImeArtikla();

        boolean isInArtikelList = false;

        // poiscemo ce je v artikel list
        for (Artikel artikel : artikelList) {
            if (artikel.getImeArtikla().equals(imeArtikla)) {
                artikel.setValue(artikel.getValue() + 1); // povecamo value artikla za ena
                isInArtikelList = true;
                break;
            }
        }

        // ce ni ga dodamo
        if (!isInArtikelList) {
            artikelList.add(new Artikel(1, imeArtikla));
        }

        return imeArtikla;
    }
}
