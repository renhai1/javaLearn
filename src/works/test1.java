package works;

import org.junit.Test;

import java.util.Date;

/**
 * @className:test1
 * @description: java网课练习
 * @author: renhai
 * @create: 2021-09-13 10:09
 */
public class test1 {
    @Test
    public void test1() {
        round round1 = new round(1);
        System.out.println(round1.getLength());
        System.out.println(round1.getSquare());
        BankAccount bankAccount1 = new BankAccount("1457481392");
        bankAccount1.deposit(500);
        bankAccount1.withdrawal(100);
        System.out.println(bankAccount1.getBalance());
        employee employee1 = new employee();
        employee1.setName("Sherry");
        employee1.setSex('女');
        employee1.setDate(new Date());
        employee1.setSalary(500);
        System.out.println(employee1);


    }
}
