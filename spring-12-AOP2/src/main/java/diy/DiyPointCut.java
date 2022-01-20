package diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/19 0:22
 * @Computer CJJ_IT
 */
@Controller
@Aspect
public class DiyPointCut {
    @Before("execution(* Service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("方法执行前");
    }
    @After("execution(* Service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后");
    }
    @Around("execution(* Service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp)throws Throwable {
        System.out.println("环绕前");
        Object proceed = jp.proceed();
        //System.out.println(proceed);
        System.out.println("环绕后");
    }
    @AfterReturning("execution(* Service.UserServiceImpl.*(..))")
    public void afterReturn(){
        System.out.println("后置通知");
    }
}

