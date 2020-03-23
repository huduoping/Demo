package com.Boot.MybatisMode.Controller;

import com.Boot.MybatisMode.Entity.User;
import com.Boot.MybatisMode.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author 24649
 */
@Controller
@RequestMapping("/user")
public class MyController {
    @Resource
    UserService userService;

    @RequestMapping("/query")
    @ResponseBody
    public String query(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        String name = userService.getName(userId);
        return name;
    }

    @RequestMapping("/show")
    public String show(HttpServletRequest request, Model model) {
        //int userId = Integer.parseInt(request.getParameter("id"));
        User user = userService.show(1);
        model.addAttribute("user", user);
        return "user/show";
    }

    @RequestMapping("/showList")
    public String showList(HttpServletRequest request, Model model) {
        List<User> list = userService.showList();
        model.addAttribute("list", list);
        return "user/showList";
    }


}
