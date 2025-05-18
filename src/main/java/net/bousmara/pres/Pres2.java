package net.bousmara.pres;

import net.bousmara.dao.IDao;
import net.bousmara.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine(); // Lire l'implementation DAO
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();

        String metierClassName = scanner.nextLine(); // Lire l'implementation Metier implementation
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);
        //IMetier metier = (IMetier) cMetier.getConstructor().newInstance();
        //Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
        //setDao.invoke(metier,dao);

        System.out.println("RES=" + metier.calcul());
    }
}