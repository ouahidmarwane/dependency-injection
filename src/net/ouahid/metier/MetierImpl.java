package net.ouahid.metier;

import net.ouahid.dao.Daoimp;
import net.ouahid.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl() {
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res=t * 2;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
