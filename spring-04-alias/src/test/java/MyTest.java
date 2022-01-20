import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;
import pojo.UserT;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/18 17:48
 * @Computer CJJ_IT
 */
public class MyTest {
    @Test
    public void Test1() {
        //获取Spring的上下文对象！

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在Spring中的管理了，我们需要使用，直接去里面取出来就可以！
        User user = (User) context.getBean("userNew");//该值为bean中的id值
        System.out.println(user.toString());
    }

    @Test
    public void Test2() {
        //获取Spring的上下文对象！

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在Spring中的管理了，我们需要使用，直接去里面取出来就可以！
        UserT userT = (UserT) context.getBean("u4");//该值为bean中的id值
        userT.pop();
    }
}

