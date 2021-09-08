package stream;

import org.junit.Test;

/**
 * @className:StreamAPI
 * @description: steamAPI讲解
 * @author: renhai
 * @create: 2021-09-08 17:09
 */
public class StreamAPI {
    @Test
    public void test1()
    {
        /**
         * 1 Stream 关注的是对数据的运算，与CPU打交道
         *      集合关注的是数据的存储，与内存打交道
         * 2
         *      Stream 自己不会存储元素
         *      Stream 不会改变源对象，相反他们会返回一个持有结果的新Stream
         *      Stream 操作是延迟执行的。这意味着他们会等到需要结果的时候才执行
         *
         * 3 Stream 执行流程
         *      Stream 的实例化
         *      一系列的中间操作
         *      终止操作
         * 4
         *      一个中间 操作链，对数据源的数据进行处理
         *      一旦执行终止操作，就执行中间操作链，并产生结果。之后不会被调用
         */


    }
}
