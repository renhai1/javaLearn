package CommonlClass;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @className:commonCompare
 * @description:
 * @author: renhai
 * @create: 2021-08-31 15:51
 */
public class commonCompare {
    @Test
    public void test1() {
        //比较对象大小
        Goods[] goods = new Goods[4];
        goods[0] = new Goods(50, "小米");
        goods[1] = new Goods(125, "apple");
        goods[2] = new Goods(130, "Microsoft");
        goods[3] = new Goods(20, "hp");
        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));

    }

    @Test
    public void test2() {
        String []strs=new String[]{"BB","AA","cc","XX","SS"};
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(strs));

        Goods[] goods = new Goods[4];
        goods[0] = new Goods(50, "xiaomi");
        goods[1] = new Goods(125, "apple");
        goods[2] = new Goods(130, "Microsoft");
        goods[3] = new Goods(20, "hp");
        Arrays.sort(goods, new Comparator<Goods>() {
            @Override
            public int compare(Goods o1, Goods o2) {
                if (o1.getName().equals(o2.getName()))
                {
                    return -Double.compare(o1.getPrices(),o2.getPrices());
                }else
                {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });
        System.out.println(Arrays.toString(goods));
    }
}

class Goods implements Comparable {
    private int prices;
    private String name;

    public Goods(int prices, String name) {
        this.prices = prices;
        this.name = name;
    }

    public int getPrices() {
        return prices;
    }

    public void setPrices(int prices) {
        this.prices = prices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "prices=" + prices +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods) {
            Goods good = (Goods) o;
            if (this.prices > good.prices) {
                return 1;
            } else if (this.prices < good.prices) {
                return -1;
            } else {
                return 0;
            }
        }
        return 0;


    }
}
