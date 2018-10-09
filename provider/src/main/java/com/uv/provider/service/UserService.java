package com.uv.provider.service;

import com.uv.provider.entity.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/*
 * @author uv
 * @date 2018/10/8 14:46
 *
 */
@Service
public class UserService {

    private static List<User> userList = null;
    //模拟数据库数据
    static {
        userList = new ArrayList<>();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        user1.setId(1).setName("Tom").setSex("男").setAge(18);
        user2.setId(2).setName("Sam").setSex("男").setAge(19);
        user3.setId(3).setName("Ling").setSex("女").setAge(18);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
    }

    public List<User> getUserList() {
        return userList;
    }
    public User getUser(int id) {
        for (User user : userList) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
