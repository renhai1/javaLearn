package reflect;

import functions.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @className:reflect1
 * @description: 反射类讲解
 * @author: renhai
 * @create: 2021-09-06 10:56
 */
public class reflect1 {
    @Test
    public void test1() throws NoSuchMethodException {
        //通过实例化获得对象
        Person person1 = new Person("Sherry", 18);
        System.out.println(person1.getName());
        //通过反射获得对象
        Class class1 = person1.getClass();
        Constructor constructor1 = class1.getConstructor(String.class, int.class);
        try {
            Person person2 = (Person) constructor1.newInstance("renhai", 19);
            System.out.println(person2);
            System.out.println(person2.getName());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test2() {
        //获取Class的实例
        /**
         * 加载到内存中 的运行时类，会缓存一定的时间。在此时间内，我们可以通过不同的方式来获取此运行时类
         */
        //1 调用.class
        Class class1 = Person.class;
        System.out.println(class1);
        //2 运行时类
        Class class2 = new Person().getClass();
        System.out.println(class2);
        //3 调用Class的静态方法
        try {
            Class class3 = Class.forName("functions.Person");
            System.out.println(class3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //4 classLoader
        ClassLoader classLoader1 = Person.class.getClassLoader();
        try {
            Class class4 = classLoader1.loadClass("functions.Person");
            System.out.println(class4);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
