import dao.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

import java.io.IOException;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/19 19:59
 * @Computer CJJ_IT
 */
public class MyTest {
    @Test
    public void test() throws IOException {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        for (User user : userMapper.SelectUser()) {
            System.out.println(user);
        }
    }

}
