package Thread;

/**
 * @className:deadlock
 * @description:
 * @author: renhai
 * @create: 2021-08-30 17:42
 */
public class deadlock {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer();

        new Thread() {
            @Override
            public void run() {
                synchronized (str1) {
                    str1.append("a1");
                    str2.append("b1");
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    synchronized (str2) {
                        str1.append(" a2");
                        str2.append(" b2");
                        System.out.println(str1);
                        System.out.println(str2);
                    }
                }
            }
        }.start();

        new Thread(new RunnableImpl()) {
            @Override
            public void run() {
                synchronized (str2) {
                    str1.append(" a3");
                    str2.append(" b3");
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    synchronized (str1) {
                        str1.append(" a4");
                        str2.append(" b4");
                        System.out.println(str1);
                        System.out.println(str2);
                    }
                }
            }
        }.start();
    }
}
