package cn.kpic.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bjsunqinwen on 2016/6/17.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/index")
    public String Home(){
        return "/index";
    }

}
