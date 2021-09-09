package works;

/**
 * @className:work1
 * @description: 作业1（使用Eclipse计算正方形的周长和面积）。
 * @author: renhai
 * @create: 2021-09-09 16:58
 */
public class work1 {
    public static void main(String[] args) {
        //实例化正方形对象
      square square1=  new square(5);
      //调用square中的周长计算方法
      double allLength=square1.perimeter();
      //调用square中的面机计算方法
      double proportion1=square1.area();
      //输出周长
        System.out.println("周长为:"+allLength);
      //输出面积
        System.out.println("面积为:"+proportion1);
    }
}
