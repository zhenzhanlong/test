package com.gupaoedu.mvcframework.annotation;

import java.lang.annotation.*;
//多个文件冲突测试
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GPController {
    String value() default "";
}
