package com.gupaoedu.mvcframework.annotation;

import java.lang.annotation.*;
//哈桑·怀特塞德
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GPService {
    String value() default "";
}
