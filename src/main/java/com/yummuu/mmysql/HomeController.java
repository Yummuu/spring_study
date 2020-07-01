package com.yummuu.mmysql;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(ModelMap model){
        model.put("time",new Date());
        model.put("message","welcome");
        return "view/index";
    }
}
