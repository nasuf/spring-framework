package org.nasuf.springframework.aop;

public interface ClassFilter {
    boolean matches(Class<?> clazz);
}
