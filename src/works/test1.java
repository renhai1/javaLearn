package works;

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

/**
 * @className:test1
 * @description: java网课练习
 * @author: renhai
 * @create: 2021-09-13 10:09
 */
public class test1 {
    @Test
    public void test1() {
        //作业1
        round round1 = new round(1);
        System.out.println(round1.getLength());
        System.out.println(round1.getSquare());

        //作业2
        BankAccount bankAccount1 = new BankAccount("1457481392");
        bankAccount1.deposit(500);
        bankAccount1.withdrawal(100);
        System.out.println(bankAccount1.getBalance());

        //作业3
        employee employee1 = new employee();
        employee1.setName("Sherry");
        employee1.setSex('女');
        employee1.setDate(new Date());
        employee1.setSalary(500);
        System.out.println(employee1);




    }
    @Test
    public void test2()
    {
        String number="123";
        int sum=0;
        for (int i=0;i<number.length();i++)
        {
            sum=sum+Integer.parseInt(number.substring(i,i+1));
        }
        System.out.println(sum);

        double r;
        r=new Scanner(System.in).nextDouble();

        double S=(Math.PI)*r*r;
        System.out.println(S);
    }
}
