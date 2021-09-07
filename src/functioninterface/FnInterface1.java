package functioninterface;

import org.junit.Test;

import java.io.PrintStream;
import java.util.function.Consumer;

/**
 * @className:FnInterface1
 * @description: 函数式接口讲解
 * @author: renhai
 * @create: 2021-09-07 15:06
 */
public class FnInterface1 {
    //    接口中只有一个抽象方法 称为函数式接口
    /**
     * 可以通过lambda表达式来创建该接口的对象
     * 利用Functionallnterface注解检查某接口是否为函数式接口、
     * java.util.function包下定义了java8的丰富的函数式接口
     *
     * 消费型接口 Consumer<T>    void accept(T t)
     * 供给型接口 Supplier<T>    T get()
     * 函数型接口 Function<T,R>  R apply(T t)
     * 断定型接口 Predicate<T>   boolean test(T t)
     *
     */

    @Test
    public void test1()
    {
        Consumer<String> consumer1=str -> System.out.println(str);
        consumer1.accept("北京");
        System.out.println("*****************");
        PrintStream printStream1=System.out;
        Consumer<String>consumer2=printStream1::println;
        consumer2.accept("beijing");
    }

}
