package com.springapp.mvc.DAO;

import com.springapp.mvc.HibernateUtil;
import com.springapp.mvc.Model.UserAuthInfo;
import com.springapp.mvc.Model.UserAuthRole;
import org.hibernate.Session;

/**
 * Created by Beta on 8/9/14.
 */
public class UserAuthDAOImpl implements UserAuthDao {
    @Override
    public void register(UserAuthInfo info) {
        Session session = HibernateUtil.getSessionFactory().
                openSession();
        session.beginTransaction();
        info.setEnabled(1);
        UserAuthRole role = new UserAuthRole("ROLE_USER",info);
        session.save(role);
        session.getTransaction().commit();
        session.close();

    }
}
