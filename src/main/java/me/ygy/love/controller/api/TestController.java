package me.ygy.love.controller.api;

import com.google.common.collect.Maps;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yuguangyuan
 */
@Controller
public class TestController {


  @RequestMapping("name-test")
  @ResponseBody
  public String testName(String man, String woman,
                         @CookieValue(name = "sessionId", required = false) String sessionId,
                         HttpServletRequest request,
                         HttpServletResponse response) {
    if (StringUtils.isBlank(man) || StringUtils.isBlank(woman)) {
      return Result.SUCCESS.toJson();
    }

    if (StringUtils.isBlank(sessionId)) {

    } else {

      // set cookie
    }
  }

}
