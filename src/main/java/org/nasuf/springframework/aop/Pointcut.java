package org.nasuf.springframework.aop;

public interface Pointcut {
    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
