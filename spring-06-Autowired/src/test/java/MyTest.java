import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.People;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/18 17:48
 * @Computer CJJ_IT
 */
public class MyTest {

    @Test
    public void test1() {
        //固定
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        System.out.println(people.toString());
        people.getCat().shout();
        people.getDog().shout();
    }

}

