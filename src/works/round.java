package works;

/**
 * @className:round
 * @description: 圆类
 * @author: renhai
 * @create: 2021-09-20 16:43
 */
public class round {
    private double r;

    public round() {
        System.out.println("这是空参构造器");
    }

    public round(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }
    public double getLength()
    {
        return 2*Math.PI*r;
    }
    public double getSquare()
    {
        return Math.PI*Math.pow(r,2);
    }
}
