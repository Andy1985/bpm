package com.weibangong.lixm.Controller;

import com.weibangong.lixm.Model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/query/{id}")
    public User query() {
        return new User();
    }
}