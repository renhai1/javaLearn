package Thread;

/**
 * @className:ticket
 * @description:
 * @author: renhai
 * @create: 2021-08-30 15:06
 */
public class ticket {
    public static void main(String[] args) {
        ticketSystem t1 = new ticketSystem();
        ticketSystem t2 = new ticketSystem();
        ticketSystem t3 = new ticketSystem();
        t1.start();
        t2.start();
        t3.start();
    }
}

class ticketSystem extends Thread {
    private static int num = 50;
//    private static Object object = new Object();
//利用同步方法来进行同步实现是把要同步的代码抽象成一个方法，该方法加关键字synchronized,继承加上static synchronized
    @Override
    public void run() {
        while (true) {
//            synchronized (object)
            //讲类加载进内存，成为唯一对象
            synchronized (ticketSystem.class) {
                if (num > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖票票号为:" + num);
                    num--;
                } else {
                    break;
                }
            }

        }
    }
}

