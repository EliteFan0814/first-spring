package org.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Aspect
@Configuration
public class CacheAspect {
    Map<String, Object> cache = new HashMap<>();

    @Around("@annotation(org.example.anno.Cache)")
    public Object cache(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getName();
        Object cachedValue = cache.get(methodName);
        if (cachedValue != null) {
            System.out.println("方法在缓存中被调用");
            return cachedValue;
        } else {
            System.out.println("方法第一次被调用");
            Object realValue = joinPoint.proceed();
            cache.put(methodName, realValue);
            return realValue;
        }
    }
}
