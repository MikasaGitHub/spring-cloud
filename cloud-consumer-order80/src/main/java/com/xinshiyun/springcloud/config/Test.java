package com.xinshiyun.springcloud.config;

/**
 * @description:
 * @author: Akira
 * @create: 2021-05-27 11:01
 **/
public class Test {

    public synchronized void test1() {
        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName() + "第" + i + "次");
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void test2() {
        synchronized (this) {
            for (int i = 0; i < 4; i++) {
                System.out.println(Thread.currentThread().getName() + "第" + i + "次");
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        Test test33= new Test();
        new Thread(() -> {
            test33.test1();
        }).start();

        new Thread(() -> {
            test33.test2();
        }).start();
    }
}
