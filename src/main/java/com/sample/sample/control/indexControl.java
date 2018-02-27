package com.sample.sample.control;

import com.sample.sample.domain.User;
import com.sample.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexControl {
    @Autowired
    private UserService user;

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView view=new ModelAndView();
        User x=new User();
        x.setUsername("333");
        x.setPassword("rrrrrr");
        int i=user.add(x);
        view.addObject("i",i);
        view.setViewName("index");
        return view;
    }
}
