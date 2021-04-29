package aboutNullSometing;

/**
 * @Description
 * @Version
 * @Date 2021/4/25
 * @Author Gon
 */
public class Demo2
{
    public static void main(String[] args)
    {
        String str = gg();
        System.out.println(str);
//        System.out.println(str.getType());
    }

    public static String gg()
    {
        return null;
    }
}
