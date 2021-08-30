package Thread;

/**
 * @className:Runnable
 * @description:
 * @author: renhai
 * @create: 2021-08-30 15:10
 */
public class Runnable1 {
    public static void main(String[] args) {
        RunnableImpl RUN1 = new RunnableImpl();
        Thread t1 = new Thread(RUN1);
        Thread t2 = new Thread(RUN1);
        t1.start();
        t2.start();
    }

}

class RunnableImpl implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}