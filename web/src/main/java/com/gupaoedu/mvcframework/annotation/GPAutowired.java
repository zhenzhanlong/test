package com.gupaoedu.mvcframework.annotation;

import java.lang.annotation.*;
//根据文件夹来显示，多个文件冲突测试
//根据文件夹来显示 哈桑·怀特塞德
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GPAutowired {
    String value() default "";
}
