package com.uv.consumer;

import com.uv.consumer.client.UserClient;
import com.uv.consumer.entity.User;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerApplicationTests {

    @Autowired
    private UserClient userClient;

	@Test
	public void contextLoads() {
        User user = userClient.getUserById(1);
        System.out.println(user.getName());
    }

}
