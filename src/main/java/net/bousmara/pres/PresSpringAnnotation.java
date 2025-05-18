package net.bousmara.pres;

import net.bousmara.dao.IDao;
import net.bousmara.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("net.zerhouani");
        // ou ApplicationContext context = new AnnotationConfigApplicationContext("net.zerhouani.dao", "net.zerhouani.metier");

        IMetier metier = (IMetier) context.getBean(IMetier.class);
        System.out.println("RES = "+metier.calcul());

    }
}
