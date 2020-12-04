package com.Xiaoyi.singleton;

/**
 * @author ：Xiaoyi
 * @Date ：Created in 15:46 2020/12/3
 * @Description：
 * @Modified By：
 * @Version: 1.0
 */
public class TestHungary implements Runnable{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            TestHungary test = new TestHungary();
            new Thread(test).start();
        }
    }
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + "----" + SingletonHungary.getInstance().toString());
    }
}
