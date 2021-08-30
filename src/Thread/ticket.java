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

    @Override
    public void run() {
        while (true) {
            if (num > 0) {
                System.out.println(Thread.currentThread().getName() + "卖票票号为:" + num);
                num--;
            } else {
                break;
            }
        }
    }
}

