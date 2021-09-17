package works;

import java.util.Scanner;

/**
 * @className:LeapYear
 * @description: 闰年判断
 * @author: renhai
 * @create: 2021-09-17 15:16
 */
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner in = new Scanner(System.in);
        year = in.nextInt();
        if (year % 400 == 0) {
            System.out.println("闰年");
        } else if (year % 4 == 0 && year % 100 != 0)
        {
            System.out.println("闰年");
        }else
        {
            System.out.println("不是闰年");
        }

    }
}
