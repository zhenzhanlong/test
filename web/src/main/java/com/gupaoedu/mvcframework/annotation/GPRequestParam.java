package com.gupaoedu.mvcframework.annotation;

import java.lang.annotation.*;
//哈桑·怀特塞德
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GPRequestParam {
    String value() default "";
}
