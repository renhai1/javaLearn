package Thread;

/**
 * @className: ThreadTest1
 * @description: java学习
 * @author: renhai
 * @create: 2021-08-30 9:09
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        MyTheadTest1 myTheadTest1 = new MyTheadTest1();
        myTheadTest1.setName("线程一");
        //设置执行的优先级 setPriority 高概率被执行到 还是穿插执行
        myTheadTest1.setPriority(Thread.MAX_PRIORITY);
        myTheadTest1.start();
//        myTheadTest1.run();
        Thread.currentThread().setName("主线程：");
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
//        new Thread() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println(Thread.currentThread().getName() + ":******");
//
//                }
//            }
//        }.start();
    }

}

/**
 * @Author renhai
 * @Description 线程创建
 * @Date 9:12 2021/8/30
 * @Param
 * @return
 **/

class MyTheadTest1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
//                if (i%20==0)
//                {
//                   this.yield();
//                }
            }

        }
    }
}
