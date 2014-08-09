package com.springapp.mvc;

import com.springapp.mvc.Model.UserAuthInfo;
import com.springapp.mvc.Model.UserAuthRole;
import org.hibernate.Session;

/**
 * Created by Beta on 8/7/14.
 */
public class ф {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().
                openSession();
        session.beginTransaction();
        UserAuthInfo info = new UserAuthInfo("Alber","qwe",1);
        UserAuthRole role = new UserAuthRole("ROLE_USER",info);
        session.save(role);
        session.getTransaction().commit();
        session.close();
    }
}
