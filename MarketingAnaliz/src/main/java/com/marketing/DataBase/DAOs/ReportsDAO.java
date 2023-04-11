package com.marketing.DataBase.DAOs;

import com.marketing.DataBase.pojoes.Reports;
import com.marketing.DataBase.HibernateClass;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ReportsDAO {
    public Reports findById(int id) {
        return (Reports) HibernateClass.getSessionFactory().openSession().get(Reports.class, id);
    }

    public void save(Reports user) {
        Session session = HibernateClass.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public void update(Reports user) {
        Session session = HibernateClass.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    public void delete(Reports user) {
        Session session = HibernateClass.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        //tx1.commit();
        session.close();
    }


    public List<Reports> findAll() {
        List<Reports> users = (List<Reports>)  HibernateClass.getSessionFactory().openSession().createQuery("From Report").list();
        return users;
    }
}
