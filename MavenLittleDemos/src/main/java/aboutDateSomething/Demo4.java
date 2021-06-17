package aboutDateSomething;

/**
 * @Description
 * @Version
 * @Date 2021/5/27
 * @Author Gon
 */
public class Demo4
{
    public static void main(String[] args)
    {
        String str = "2021-05-01T00:00:00";
        str = str.replace("-","");
        System.out.println(str);
        str = str.substring(0,6);
        System.out.println(str);
    }
}
