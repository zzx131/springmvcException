package com.ebonapp.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ebonapp.model.User;
import com.ebonapp.service.IUserService;

 
@Controller
public class HelloSpringController {
    String message = "Welcome to Spring MVC!";
    @Autowired
    private IUserService userService;
    
    
    @RequestMapping("/hello")
    public ModelAndView showMessage(@RequestParam(value = "name", required = false, defaultValue = "Spring") String name) {
 
        ModelAndView mv = new ModelAndView("hellospring");//指定视图
        User user = new User();
        user.setId("1");
        user.setName("张三");
        user.setAge("11");
        userService.add(user);
        //向视图中添加所要展示或使用的内容，将在页面中使用
        mv.addObject("message", message);
        mv.addObject("name", name);
        return mv;
    }
}
