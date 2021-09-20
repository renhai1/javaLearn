package works;

import java.util.Date;

/**
 * @className:employee
 * @description: 员工类
 * @author: renhai
 * @create: 2021-09-20 17:11
 */
public class employee {
    private String name;
    private char sex;
    private Date date;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", date=" + date +
                ", salary=" + salary +
                '}';
    }
}
