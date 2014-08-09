package com.springapp.mvc.DAO;

import com.springapp.mvc.DAO.UserDAO;
import com.springapp.mvc.HibernateUtil;
import com.springapp.mvc.Model.User;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;

import java.util.List;

/**
 * Created by Beta on 8/7/14.
 */
public class UserDaoImpl implements UserDAO {
    @Override
    public void Create(User u) {
        Session session = HibernateUtil.getSessionFactory().
                openSession();
        session.beginTransaction();
        session.save(u);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public boolean Delete(User u) {
        Session session = HibernateUtil.getSessionFactory().
                openSession();
        session.beginTransaction();
        session.delete(u);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public User Read(int id) {
        Session session = HibernateUtil.getSessionFactory().
                openSession();
        List<User> list = session.createCriteria(User.class).
                add(Expression.like("id", id)).list();
        session.close();
        return (list == null || list.size()==0) ?
                null : list.get(0);

    }

    @Override
    public void Update( User u) {

        Session session = HibernateUtil.getSessionFactory().
                openSession();
        session.beginTransaction();
        session.update(u);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<User> ReadAll() {
        Session session = HibernateUtil.getSessionFactory().
                openSession();
        List<User> list = session.createCriteria(User.class).
                list();
        session.close();
        return list;
    }
}
