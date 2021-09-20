package works;

/**
 * @className:BankAccount
 * @description:
 * @author: renhai
 * @create: 2021-09-20 17:00
 */
public class BankAccount {
    private String name;
    private String bankId;
    private double balance;
    private int bankNumber;

    public BankAccount() {
        System.out.println("请调用设置账户的方法提供账号:");
    }

    public BankAccount(String bankId) {
        this.bankId = bankId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(int bankNumber) {
        this.bankNumber = bankNumber;
    }

    public void withdrawal(double money) {
        //同步处理
        synchronized (this) {
            if (money > balance) {
                System.out.println("超出账户余额，你的余额为:" + getBalance() + "请重新输入");
            } else {
                balance = balance - money;
                System.out.println("取款成功,请退出");
            }
        }
    }

    public void deposit(double money) {
        //同步处理
        synchronized (this) {
            balance = balance + money;
            System.out.println("存款成功,请继续操作");
        }
    }


}
