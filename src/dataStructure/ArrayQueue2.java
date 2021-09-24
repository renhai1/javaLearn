package dataStructure;

/**
 * @className:ArrayQueue
 * @description: 队列讲解
 * @author: renhai
 * @create: 2021-09-16 18:07
 */


public class ArrayQueue2 {
    public static void main(String[] args) {
        //队列先入先出 后入后出
        ArrayQueueImpl2 arr=new ArrayQueueImpl2(4);
        arr.addQueue(10);
        arr.addQueue(11);
        arr.addQueue(12);
        //arr.addQueue(13);
        arr.getQueue();
//        arr.getQueue();
        arr.showQueue();
        arr.addQueue(14);
        arr.showQueue();
        arr.getQueue();
        arr.addQueue(14);
        arr.showQueue();

    }
}

//数组模拟队列(存在问题)
class ArrayQueueImpl2 {
    private int maxSize; //容器最大值
    private int front; //front指向队列的第一个元素 默认初始值0
    private int rear;//rear指向队列的最后一个元素的后一个位置 指向后一个位置的原因是希望空出一个空间作为约定 rear的初始值为0
    private int[] arr;//存放数据，模拟队列

    //创建队列的构造器
    public ArrayQueueImpl2(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
    }

    //判断队列是否满了
    public boolean isFull() {

        return (rear + 1) % maxSize == front;
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
            arr[rear] = n;
            rear = (rear + 1) % maxSize;
            System.out.println("rear:"+rear);
        }
    }

    //获取队列数据，出队列
    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列空。");
        }
        int tempValue = arr[front];
        front = (front + 1) % maxSize;
        System.out.println("front:"+front);
        return tempValue;
    }

    //显示队列的所有数据
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列空，没有数据");
            return;
        }
        //从front开始遍历
        for (int i = front; i < front + (rear + maxSize - front) % maxSize; i++) {
            System.out.printf("arr[%d]=%d\n", i % maxSize, arr[i % maxSize]);
        }
    }

    //显示队列的头数据
    public int headData() {
        if (isEmpty()) {
            throw new RuntimeException("队列空");
        }
        return arr[front];
    }
}
