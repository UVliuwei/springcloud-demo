package com.uv.consumer.client;

import com.uv.consumer.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author uv
 * @date 2018/10/8 19:00
 *
 */
@RestController
public class controller {

    @Autowired
    private UserClient userClient;

    @RequestMapping("test")
    public void test() {
        List<User> userList = userClient.getUserList();
        System.out.println(userList.size());
        User userById = userClient.getUserById(2);
        System.out.println(userById.getName());
        User userByPath = userClient.getUserByPath(3);
        System.out.println(userByPath.getName());
    }

}
