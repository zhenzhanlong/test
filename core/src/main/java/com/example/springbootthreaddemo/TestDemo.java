package com.example.springbootthreaddemo;

/**
 * 风骚的Mic 老师
 * create-date: 2020/5/16-20:28
 */
public class TestDemo extends Thread{
    @Override
    public void run() {
       //线程会执行的指令
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Come in");
    }

    public static void main(String[] args) {
        TestDemo testDemo=new TestDemo();
        testDemo.start();

        testDemo.stop(); //不建议 强制终止这个线程。

        //发送终止通知


    }
}
