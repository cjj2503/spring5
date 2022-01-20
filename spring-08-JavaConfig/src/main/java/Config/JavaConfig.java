package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pojo.User;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/18 21:55
 * @Computer CJJ_IT
 */
// 这个也会Spring容器托管，注册到容器中，因为它本来就是一个@Component
// @Configuration代表这是一个配置类，就和我们之前看的beans.xml
    //我们现在要完全不使用Spring的xml配置了，全权交给Java来做!
@Configuration
@ComponentScan("pojo")
@Import(JavaConfig2.class)
public class JavaConfig {

    // 注册一个bean，就相当于我们之前写的一个bean标签
    // 这个方法的名字，就相当于bean标签中id属性
    // 这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User user(){
        return new User(); // 就是返回要注入到bean的对象！
    }
}

