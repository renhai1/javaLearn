package lambda;

import org.junit.Test;

import java.util.Comparator;

/**
 * @className:lambdaTest1
 * @description:JDK8 lambda表达式
 * @author: renhai
 * @create: 2021-09-06 22:36
 */
public class lambdaTest1 {
    /**
     *  接口必需是函数式接口
     * -> lambda 形参列表的参数类型可以省略（类型推断） ；如果lambda形参列表只有一个参数小括号（）也可以省略
     * -> lambda体应该使用一对{ }包裹；如果lambda体只有一条执行语句（可能是return语句），可以省略大括号和return关键字
     */
    @Test
    public void test1() {
        Runnable r1 = () -> System.out.println("Sherry");
        r1.run();
    }

    @Test
    public void test2() {
        Comparator<Integer> comparator1 = (o1, o2) -> Integer.compare(o1, o2);
        int compare1 = comparator1.compare(32, 31);
        System.out.println(compare1);
    }
}
