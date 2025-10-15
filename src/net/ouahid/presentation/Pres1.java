package net.ouahid.presentation;

import net.ouahid.dao.Daoimp;
import net.ouahid.ext.DaoImplV2;
import net.ouahid.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d);
        System.out.println("Res= "+metier.calcul());
    }
}
