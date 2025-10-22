package net.ouahid.metier;

import net.ouahid.dao.Daoimp;
import net.ouahid.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service("metier")
public class MetierImpl implements IMetier {
    @Autowired
    @Qualifier("d2")
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
