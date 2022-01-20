import Service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/19 0:15
 * @Computer CJJ_IT
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //动态代理代理的是接口：注意点
        UserService userService = (UserService) context.getBean("userService");

        userService.add();
//        userService.select();
    }
}

