package genericity;

import org.junit.Test;

import java.util.*;

/**
 * @className:genericityTest1
 * @description: 泛型的讲解
 * @author: renhai
 * @create: 2021-09-05 10:43
 */
public class genericityTest1 {
    @Test
    public void test1() {
        //泛型不能是基本类型
        /**
         * A是B的父类  G<B>不能赋值给G<A>
         * G继承与T  G<A>可以赋值给T<A>
         *对于list<?>不能添加东西，只能添加null
         * list<?>赋值之后可以读取数据
         * G<? extends A> 可以作为G<A> 和G<B>的父类的，其中B是A的子类
         * G<? super A> 可以作为G<A> 和G<B>的父类的，其中B是A的父类
         */
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("renhai");
        list1.add("Sherry");
        for (String name : list1) {
            System.out.println(name);
        }
        Iterator<String> iterator = list1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("renhai", 100);
        map.put("Sheery", 99);
        Set set1 = map.entrySet();
        System.out.println(set1);
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
