package com.springapp.mvc.Contoller;

import com.springapp.mvc.DAO.UserDaoImpl;
import com.springapp.mvc.DAO.UserDAO;
import com.springapp.mvc.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Beta on 8/7/14.
 */
@Controller
@RequestMapping("/User")
public class UserController {
    UserDAO userDAO = new UserDaoImpl();
    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model){


        List<User> list = userDAO.ReadAll();

        model.addAttribute("users",list);
        return "users/index";
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("user") User user
            ,BindingResult result) {
        //System.out.println(user.getName());
        userDAO.Create(user);
        return "redirect:/User/";
    }
    @RequestMapping("/delete/{userId}")
    public String deleteContact(@PathVariable("userId") Integer userId) {

        userDAO.Delete(userDAO.Read(userId));

        return "redirect:/User/";
    }
    @ModelAttribute("user")
    public User createModel() {
        return new User();
    }
}
