package com.example.springbootthreaddemo;

import com.example.springbootthreaddemo.persistence.User;
import com.example.springbootthreaddemo.service.IUserService;
import com.example.springbootthreaddemo.service.SmsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 风骚的Mic 老师
 * create-date: 2020/5/16-20:45
 */
@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @Autowired
    SmsClient smsClient;

    @PostMapping("/user")
    public String addUser(User user){
        long start=System.currentTimeMillis();
        userService.insert(user);
        long end=System.currentTimeMillis();
        return "SUCCESS:"+(end-start);
    }
    ExecutorService executorService= Executors.newFixedThreadPool(10);
    @PostMapping("/sms/user")
    public String register(User user){
        long start=System.currentTimeMillis();
        userService.insert(user);
        //异步.  Future ->
        //会创建N个线程
        //MQ来代替
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                smsClient.sendSms("16607691862");
            }
        });
        long end=System.currentTimeMillis();
        return "SUCCESS:"+(end-start);
    }
}
