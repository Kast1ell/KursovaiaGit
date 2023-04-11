package com.marketing.DataBase.DAOs;

import com.marketing.DataBase.HibernateClass;
import com.marketing.DataBase.pojoes.UserProfiles;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserProfilesDAO {

    public UserProfiles findById(int id) {
        return (UserProfiles) HibernateClass.getSessionFactory().openSession().get(UserProfiles.class, id);
    }

    public void save(UserProfiles user) {
        Session session = HibernateClass.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public void update(UserProfiles user) {
        Session session = HibernateClass.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    public void delete(UserProfiles user) {
        Session session = HibernateClass.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        //tx1.commit();
        session.close();
    }


    public List<UserProfiles> findAll() {
        List<UserProfiles> users = (List<UserProfiles>)  HibernateClass.getSessionFactory().openSession().createQuery("From UserProfiles").list();
        return users;
    }
}
