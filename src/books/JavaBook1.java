package books;

import org.junit.Test;

import java.time.LocalDate;

import static java.lang.Math.*;

/**
 * @className:JavaBook1
 * @description: java书基础卷练习
 * @author: renhai
 * @create: 2021-09-09 21:32
 */
public class JavaBook1 {
    @Test
    public void test1() {
        double num1 = 2.0 - 1.1;
        System.out.println(2.0 - 1.1);
        System.out.printf("%.3f",num1);

//        System.out.println(PI);
//        System.out.println(E);
//        System.out.println(4 <= 5);
    }
    @Test
    public void test2()
    {
        String str1="renhai";
        String str2=new String("renhai");
        boolean flag=(str1==str2);
        boolean flag1=(str1.equals(str2));
        System.out.println(flag);//false
        System.out.println(flag1);//true
    }
    @Test
    public void test3()
    {
        String str1=new String("renhai");
        String str2=new String("renhai");
        String str3="renhai";
        System.out.println(str1.equals(str2));
        System.out.println(System.out);
    }
}
