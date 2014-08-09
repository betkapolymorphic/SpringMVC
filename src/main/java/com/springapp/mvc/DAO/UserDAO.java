package com.springapp.mvc.DAO;

import com.springapp.mvc.Model.User;

import java.util.List;

/**
 * Created by Beta on 8/7/14.
 */
public interface UserDAO {
    void Create(User u);
    boolean Delete(User us);
    User Read(int id);
    void Update(User u);
    List<User> ReadAll();
}
