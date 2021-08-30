package Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @className:ThreadPool
 * @description:
 * @author: renhai
 * @create: 2021-08-30 20:19
 */
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor threadPoolExecutor =(ThreadPoolExecutor)executorService;
        threadPoolExecutor.setCorePoolSize(20);
        executorService.execute(new window());//适用于Runnable
//        executorService.submit(new ticketSystem());//适用于callable
        executorService.shutdown();
    }
}
