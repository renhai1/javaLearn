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
