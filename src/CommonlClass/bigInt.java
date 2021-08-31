package CommonlClass;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @className:bigInt
 * @description:
 * @author: renhai
 * @create: 2021-08-31 16:57
 */
public class bigInt {
    //大整数
    @Test
    public void test() {
        BigInteger bigInteger=new BigInteger("1000000000000000000000000000");
        System.out.println(bigInteger);
    }
}
