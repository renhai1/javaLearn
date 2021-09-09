package works;

import java.util.Scanner;

/**
 * @className:systemIn
 * @description: java控制台输入
 * @author: renhai
 * @create: 2021-09-09 16:54
 */
public class systemIn {
    public static void main(String[] args) {
        //调用System.in静态方法 实例化Scanner对象
        Scanner in=new Scanner(System.in);
        //读取整型的数值
        int num=in.nextInt();
        //输出数值（其他类型的同理）
        System.out.println(num);
    }
}
