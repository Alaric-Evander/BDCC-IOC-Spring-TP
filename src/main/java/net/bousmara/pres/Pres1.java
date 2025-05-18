package net.bousmara.pres;

import net.bousmara.dao.DaoImpl;
import net.bousmara.ext.DaoImpl2;
import net.bousmara.dao.IDao;
import net.bousmara.metier.IMetier;
import net.bousmara.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        //IDao dao = new DaoImpl(); // Instanciation statique
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl(dao);
        //metier.setDao(dao); // Injection des dépendances via le setter
        System.out.println("RES=" + metier.calcul());
    }
}