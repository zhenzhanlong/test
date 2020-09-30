package com.test.controller;

import com.test.model.UserBo;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entry")
@Api(value="登录控制器",tags={"登录控制器"})
public class EntryController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value="/signIn",method= RequestMethod.GET)
    public String login(){
        log.info("系统执行日志输出msg={}","文件内容");
        UserBo user = new UserBo();
        user.setId("122");
        user.setName("姓名");
        System.out.println("执行");
        return user.toString();
    }
}
