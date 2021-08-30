package Thread;

/**
 * @className:ticketRunnable
 * @description:
 * @author: renhai
 * @create: 2021-08-30 15:59
 */
public class ticketRunnable {
    public static void main(String[] args) {
        //只创建一个对象，解决数据公用问题
        ticket1 t1 = new ticket1();
        Thread T1 = new Thread(t1);
        Thread T2 = new Thread(t1);
        Thread T3 = new Thread(t1);
        T1.start();
        T2.start();
        T3.start();
    }
}

class ticket1 implements Runnable {
    private int num = 50;
    //Object 为监听器，需要所有线程共用同一个锁
//    Object object = new Object();

    @Override
    public void run() {
        while (true) {
            //线程同步处理
//            synchronized (object)
            //可以用当前对象充当，无需新建对象
            synchronized (this) {
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
            }
        }

    }
}
