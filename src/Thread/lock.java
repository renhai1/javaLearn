package Thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @className:lock
 * @description: 解决线程安全问题
 * @author: renhai
 * @create: 2021-08-30 19:30
 */
public class lock {
    public static void main(String[] args) {
        window window1 = new window();
        Thread t1 = new Thread(window1);
        Thread t2 = new Thread(window1);
        Thread t3 = new Thread(window1);
        t1.start();
        t2.start();
        t3.start();
    }

}

class window implements Runnable {

    private int num = 50;
    private ReentrantLock lock1 = new ReentrantLock();

    @Override
    public void run() {
        while (true) {

            try {
                lock1.lock();
                if (num > 0) {
                    //多线程的安全问题
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                    System.out.println(Thread.currentThread().getName() + "卖票，票号为:" + num);
                    num--;
                } else {
                    break;
                }
            } finally {
                lock1.unlock();
            }
        }
    }

}

