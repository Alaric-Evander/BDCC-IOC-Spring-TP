package net.bousmara.metier;

import net.bousmara.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    //@Autowired
    @Qualifier("d2")
    private IDao dao; // Couplage faible

    /**
     * Pour injecter dans l'attribut dao
     * un objet d'une classe qui implémente l'interface IDAO
     * au moment del'instanciation
     **/
    public MetierImpl(@Qualifier("d2") IDao dao) {
        this.dao = dao;
    }

    //public MetierImpl() {}

    @Override
    public double calcul() {
        double t = dao.getData(); // Uses the injected DAO
        double res = t * 12 *Math.PI/2 * Math.cos(t);
        return res;
    }

    /**
     * Pour injecter dans l'attribut dao
     * un objet d'une classe qui implémente l'interface IDAO
     * après instanciation
     **/
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}