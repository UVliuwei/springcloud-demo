package com.uv.provider.controller;

import com.uv.provider.entity.User;
import com.uv.provider.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author uv
 * @date 2018/10/8 15:26
 *
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("user/list")
    public List<User> getUserList() {
        return userService.getUserList();
    }
    @GetMapping("user/{id}")
    public User getUserByPath(@PathVariable("id") int id) {
      return userService.getUser(id);
    }
    @GetMapping("user")
    public User getUserById(int id) {
        return userService.getUser(id);
    }
}
