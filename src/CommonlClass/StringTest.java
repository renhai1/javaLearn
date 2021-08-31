package CommonlClass;

import org.junit.Test;

import java.nio.charset.StandardCharsets;

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
        String s1 = "javaEE";
        String s2 = "javaEE";
        //s3和s4 是在堆空间开辟空间 new 关键字开辟新空间（堆）
        String s3 = new String("javaEE");
        String s4 = new String("javaEE");
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);
    }

    @Test
    public void test3() {
        //String 与char的转换
        String s1 = "renhai";
        char[] arr = s1.toCharArray();
        for (char char1 : arr) {
            System.out.println(char1);

        }

    }

    @Test
    public void test4() {
        String s1 = "renhai中国";
        byte[] bytes = s1.getBytes();
        for (byte b1 : bytes) {
            System.out.println(b1);

        }
        String s2 = new String(bytes);
        System.out.println(s2);

    }

    @Test
    public void test5() {
        //效率 StringBuilder不安全>stringBuffer>String
        //stringBuffer线程安全(慢)，StringBuilder不安全（快速）
        StringBuffer stringBuffer = new StringBuffer(30);//capacity为最小的容量大小，尽量不要扩容
        stringBuffer.append("aaaaa");
        stringBuffer.append("aaaaa");
        stringBuffer.append("aaaaa");
        stringBuffer.append(111);
        stringBuffer.append(500);
        System.out.println(stringBuffer);
        //这些方法都是左边右开
        stringBuffer.replace(0, 3, "hello");
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
