package com.uv.consumer.client;

import com.uv.consumer.client.hystrix.UserHystrix;
import com.uv.consumer.entity.User;
import java.util.List;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * @author uv
 * @date 2018/10/8 18:48
 * 注意：远程调用返回的类必须有无参构造方法，否则报错
 */

//name 为调用服务的spring.application.name
@FeignClient(name = "cloud-provider", fallback = UserHystrix.class)
public interface UserClient {

    //不能市容组合注解，如GetMapping
    @RequestMapping(value = "user/list", method = RequestMethod.GET)
    List<User> getUserList();

    @RequestMapping(value = "user/{id}", method = RequestMethod.GET)
    User getUserByPath(@PathVariable("id") int id);

    //使用参数时，必须用@RequestParam注解
    @RequestMapping(value = "user", method = RequestMethod.GET)
    User getUserById(@RequestParam("id") int id);
}
