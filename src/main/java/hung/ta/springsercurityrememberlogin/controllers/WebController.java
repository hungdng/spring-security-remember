package hung.ta.springsercurityrememberlogin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HUNGTA on 10/31/17 - 11:38 PM
 * @project spring-sercurity-remember-login
 */
@Controller
public class WebController {

    @RequestMapping(value = { "/"})
    public String home() {
        return "home";
    }

    @RequestMapping(value = { "/login" })
    public String login() {
        return "login";
    }
}
