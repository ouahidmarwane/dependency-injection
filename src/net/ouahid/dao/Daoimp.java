package net.ouahid.dao;

public class Daoimp implements IDao {
    @Override
    public double getData() {
        System.out.println("version base de donnees");
        double t = 34;
        return t;
    }
}
