package aboutStringBufferSomething;

/**
 * @Description
 * @Version
 * @Date 2021/6/8
 * @Author Gon
 */
public class aboutStringSomeThing
{
    public static void main(String[] args)
    {
//        System.out.println("其实今天".contains("其实"));
//        System.out.println("其实今天".contains("卧槽"));
        String str = "人民币123456";
        System.out.println(str.substring(str.indexOf("币")));
    }
}
