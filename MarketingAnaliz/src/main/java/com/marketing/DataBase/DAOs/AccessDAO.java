package com.marketing.DataBase.DAOs;

import com.marketing.DataBase.pojoes.Access;
import com.marketing.DataBase.HibernateClass;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AccessDAO {
    public Access findById(int id) {
        return (Access) HibernateClass.getSessionFactory().openSession().get(Access.class, id);
    }

    public void save(Access user) {
        Session session = HibernateClass.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public void update(Access user) {
        Session session = HibernateClass.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    public void delete(Access user) {
        Session session = HibernateClass.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        //tx1.commit();
        session.close();
    }


    public List<Access> findAll() {
        List<Access> users = (List<Access>)  HibernateClass.getSessionFactory().openSession().createQuery("From Access").list();
        return users;
    }
}
