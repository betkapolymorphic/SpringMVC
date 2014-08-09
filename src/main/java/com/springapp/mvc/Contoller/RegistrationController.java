package com.springapp.mvc.Contoller;

import com.springapp.mvc.DAO.UserAuthDAOImpl;
import com.springapp.mvc.DAO.UserAuthDao;
import com.springapp.mvc.Model.User;
import com.springapp.mvc.Model.UserAuthInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Beta on 8/9/14.
 */
@Controller
@RequestMapping("/")
public class RegistrationController {
    UserAuthDao authDao = new UserAuthDAOImpl();
    @RequestMapping(value = "/registration",method = RequestMethod.GET)
    public String registr(ModelMap model) {

        return "registration";
    }
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("user_auth_info") UserAuthInfo user
            ,BindingResult result) {
        authDao.register(user);
        return "redirect:/User";
    }
    @ModelAttribute("user_auth_info")
    public UserAuthInfo createModel() {
        return new UserAuthInfo();
    }
}
