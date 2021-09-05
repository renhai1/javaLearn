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
