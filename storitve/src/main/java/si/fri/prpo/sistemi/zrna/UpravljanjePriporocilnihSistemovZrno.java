package si.fri.prpo.sistemi.zrna;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.logging.Logger;

@ApplicationScoped
public class UpravljanjePriporocilnihSistemovZrno {

    private Logger log = Logger.getLogger(UpravljanjePriporocilnihSistemovZrno.class.getName());


    @PostConstruct
    private void init() {

        log.info("Inicializacija zrna " + UpravljanjePriporocilnihSistemovZrno.class.getSimpleName());

    }

    @PreDestroy
    private void destroy() {

        log.info("Deinicializacija zrna " + UpravljanjePriporocilnihSistemovZrno.class.getSimpleName());

    }
}
