package aboutBigDecimalSomething;

import java.math.BigDecimal;

/**
 * @Description
 * @Version
 * @Date 2021/6/17
 * @Author Gon
 */
public class Demo
{
    public static void main(String[] args)
    {
        String str = "22.8899";
        BigDecimal bigDecimal = new BigDecimal(str);
        bigDecimal = bigDecimal.setScale(3,BigDecimal.ROUND_HALF_UP);
        System.out.println(bigDecimal.toString());
        System.out.println(bigDecimal.longValue());
        System.out.println(bigDecimal.byteValue());
        System.out.println(bigDecimal.intValue());
    }
}
