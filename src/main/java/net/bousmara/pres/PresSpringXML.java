package net.bousmara.pres;

import net.bousmara.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("RES + "+metier.calcul());
    }
}
