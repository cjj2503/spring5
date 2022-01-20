package pojo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
/**
 * @Autor $(CJJ)
 * @DATE 2021/8/18 21:34
 * @Computer CJJ_IT
 */
/*- @Autowired：自动装配通过类型，名字。如果Autowired不能唯一自动装配上属性，则需要通过@Qualifier(value = "xxx")去配置。
        - @Nullable 字段标记了这个注解，说明这个字段可以为null;
        - @Resource：自动装配通过名字，类型。*/

/*  @Scope("prototype")//多实例，IOC容器启动创建的时候，并不会创建对象放在容器在容器当中，当你需要的时候，需要从容器当中取该对象的时候，就会创建。
    @Scope("singleton")//单实例 IOC容器启动的时候就会调用方法创建对象，以后每次获取都是从容器当中拿同一个对象（map当中）。
    @Scope("request")//同一个请求创建一个实例
    @Scope("session")//同一个session创建一个实例
    */


//等价于<bean id="user" class="com.kuang.pojo.User"/>
/*@Component
public class User {
    public String name="CJJ";

}*/

//这里这个注解的意思，就是说明这个类被Spring接管了，注册到了容器中
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    //属性注入值
    @Value("CJJ")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}

