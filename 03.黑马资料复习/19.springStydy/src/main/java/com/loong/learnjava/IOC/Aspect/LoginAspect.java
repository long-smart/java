package com.loong.learnjava.IOC.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {
    // 在执行UserService的每个方法前执行
    @Before("execution(public * com.loong.learnjava.IOC.service.UserService.*(..))")
    public void doAccessCheck() {
        System.out.println("[Before] do access check");
    }

    // 在执行MailService的每个方法前后执行
    @Around("execution(public * com.loong.learnjava.IOC.service.MailService.*(..))")
    public Object doLogging(ProceedingJoinPoint pjp) throws Throwable {
        System.err.println("[Around] start " + pjp.getSignature());
        Object retVal = pjp.proceed();
        System.err.println("[Around] done " + pjp.getSignature());
        return retVal;
    }
}
