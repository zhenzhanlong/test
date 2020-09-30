package com.gupaoedu.mvcframework.annotation;

import java.lang.annotation.*;
//哈桑·怀特塞德，文件更新，浏览器文件编辑
//哈桑·怀特塞德，文件再次更新
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GPService {
    String value() default "";
}
