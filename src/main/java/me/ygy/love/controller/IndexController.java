package me.ygy.love.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yuguangyuan
 */
@Controller
@RequestMapping("/")
public class IndexController {

  @RequestMapping({"/", "/index"})
  public String index() {
    return "index";
  }

  @ResponseBody
  @RequestMapping("/hello")
  public String hello(ModelMap map) {
    map.addAttribute("host", "http://blog.didispace.com");
    return "Hello World";
  }
}
