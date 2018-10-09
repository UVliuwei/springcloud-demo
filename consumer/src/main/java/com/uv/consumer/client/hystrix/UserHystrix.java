package com.uv.consumer.client.hystrix;
/*
 * @author uv
 * @date 2018/10/9 9:03
 * 熔断器
 */

import com.uv.consumer.client.UserClient;
import com.uv.consumer.entity.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class UserHystrix implements UserClient{

    @Override
    public List<User> getUserList() {
        return new ArrayList<>();
    }

    @Override
    public User getUserByPath(int id) {
        return new User().setAge(0).setId(-1).setName(null).setSex(null);
    }

    @Override
    public User getUserById(int id) {
        return new User().setAge(0).setId(-1).setName(null).setSex(null);
    }
}
