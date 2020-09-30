package com.example.springbootthreaddemo.demo02;

import com.mysql.cj.util.TimeUtil;

import java.util.concurrent.TimeUnit;

/**
 * 风骚的Mic 老师
 * create-date: 2020/5/16-21:11
 */
public class Demo {

    public static void main(String[] args) {
        new Thread(()->{
            while(true){
                try {
                    TimeUnit.SECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"STATUS_01").start();  //阻塞状态

        new Thread(()->{
            while(true){
                synchronized (Demo.class){
                    try {
                        Demo.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"STATUS_02").start(); //阻塞状态

        new Thread(new BlockedDemo(),"BLOCKED-DEMO-01").start();
        new Thread(new BlockedDemo(),"BLOCKED-DEMO-02").start();

    }
    static class BlockedDemo extends  Thread{
        @Override
        public void run() {
            synchronized (BlockedDemo.class){
                while(true){
                    try {
                        TimeUnit.SECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
