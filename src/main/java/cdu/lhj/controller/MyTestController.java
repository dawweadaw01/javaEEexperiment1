package cdu.lhj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyTestController {
    @RequestMapping("/hello")
    public String hello() {
        return "helloView";
    }
}
