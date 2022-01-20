package Log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/19 0:04
 * @Computer CJJ_IT
 */
public class AfterLog implements AfterReturningAdvice {

    //returnValue： 返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了"+method.getName()+"方法，返回结果为："+returnValue);
    }
}

