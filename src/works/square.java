package works;

/**
 * @className:square
 * @description: 正方形实现类
 * @author: renhai
 * @create: 2021-09-09 16:49
 */
public class square implements quadrangle {
    //正方形边长
    private int sideLength;
    //正方形的边长数
    private static final int sideNumber = 4;

    public square() {
    }

    public square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double perimeter() {
        return sideNumber * sideLength;
    }

    @Override
    public double area() {

        return sideLength * sideLength;
    }
}
