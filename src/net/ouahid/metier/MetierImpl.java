package net.ouahid.metier;

import net.ouahid.dao.Daoimp;
import net.ouahid.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("metier")
public class MetierImpl implements IMetier {
    @Autowired
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
