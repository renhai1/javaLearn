package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @className:callable1
 * @description: jdk5.0Callable新增创建多线程
 * @author: renhai
 * @create: 2021-08-30 20:00
 */
public class callable1 {
    public static void main(String[] args) {
        callAble callable1 = new callAble();
        FutureTask futureTask = new FutureTask(callable1);
        new Thread(futureTask).start();
        try {
            Object sum = futureTask.get();
            System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class callAble implements Callable {
    private int sum = 0;

    @Override
    public Object call() throws Exception {
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
