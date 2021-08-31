package CommonlClass;

import org.junit.Test;

/**
 * @className:StringTest
 * @description:
 * @author: renhai
 * @create: 2021-08-31 8:34
 */
public class StringTest {
    @Test
    public void test1() {

        String name1 = "abc";
        // name1="hello";
        String name2 = "abc";
        //"abc"在方法区里面的常量池中 name1和name2存的地址相同
        //字符串常量池不会存储两个相同的字符串
        //对现有的字符串进行操作时，也是重新创建新的字符串
        //字符串的不可变性 无论对字符串进行什么改变，都是新建字符串，不会改变原有的
        name1 = name1 + "def";
        System.out.println(name1 == name2);

    }

    @Test
    public void test2() {
        //s1和s2是在方法区开辟空间
        String s1="javaEE";
        String s2="javaEE";
        //s3和s4 是在堆空间开辟空间 new 关键字开辟新空间（堆）
        String s3=new String("javaEE");
        String s4=new String("javaEE");
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s1==s3);
    }
}
