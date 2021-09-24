package dataStructure;

/**
 * @className:ArrayQueue
 * @description: 队列讲解
 * @author: renhai
 * @create: 2021-09-16 18:07
 */


public class ArrayQueue1 {
    public static void main(String[] args) {
        //队列先入先出 后入后出

    }
}

//数组模拟队列(存在问题)
class ArrayQueueImpl1 {
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    //创建队列的构造器
    public ArrayQueueImpl1(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;//指向队列头部，分析出front是指向队列头的前一个位置
        rear = -1;//指向队列尾，指向队列尾部的数据
    }

    //判断队列是否满了
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return rear == front;
    }

    //添加数据到队列
    public void addQueue(int n) {
        if (isFull()) {
            System.out.println("队列满了");
        } else {
            rear++;
            arr[rear] = n;
        }
    }

    //获取队列数据，出队列
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列空。");
        }
        front++;
        return arr[front];
    }

    //显示队列的所有数据
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列空，没有数据");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
    }

    //显示队列的头数据
    public int headData() {
        if (isEmpty()) {
            throw new RuntimeException("队列空");
        }
        front++;
        return arr[front];
    }
}
