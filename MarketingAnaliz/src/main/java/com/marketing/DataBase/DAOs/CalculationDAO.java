package com.marketing.DataBase.DAOs;

import com.marketing.DataBase.HibernateClass;
import com.marketing.DataBase.pojoes.Calculating;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CalculationDAO {
    public Calculating findById(int id) {
        return (Calculating) HibernateClass.getSessionFactory().openSession().get(Calculating.class, id);
    }

    public void save(Calculating user) {
        Session session = HibernateClass.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public void update(Calculating user) {
        Session session = HibernateClass.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    public void delete(Calculating user) {
        Session session = HibernateClass.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        //tx1.commit();
        session.close();
    }


    public List<Calculating> findAll() {
        List<Calculating> users = (List<Calculating>)  HibernateClass.getSessionFactory().openSession().createQuery("From Calculations").list();
        return users;
    }
}
