package com.gupaoedu.mvcframework.annotation;

import java.lang.annotation.*;
//哈桑·怀特塞德
//多个文件冲突测试
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GPController {
    String value() default "";
}
