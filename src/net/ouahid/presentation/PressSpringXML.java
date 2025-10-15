package net.ouahid.presentation;
import net.ouahid.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PressSpringXML {
    public static void main(String[] args) {
        ApplicationContext springcontext =
                new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = springcontext.getBean(IMetier.class);
        System.out.println("RES="+metier.calcul());
    }
}
