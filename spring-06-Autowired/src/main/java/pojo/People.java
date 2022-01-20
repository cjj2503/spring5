package pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/18 20:23
 * @Computer CJJ_IT
 */
@Data
public class People {
    //如果显式定义了Autowired的required属性为false，说明这个对象可以为null，否则不允许为空
    //@Autowired(required = false)
    @Autowired
    @Qualifier(value="cat1")
    private Cat cat;
    @Autowired
    /*如果@Autowired自动装配的环境比较复杂，自动装配无法通过一个注解【@Autowired】完成的时候，
    我们可以使用@Qualifier(value = “xxx”)去配置@Autowired的使用，指定一个唯一的bean对象注入*/
    @Qualifier(value="dog1")
    private Dog dog;
    private String name;
}

