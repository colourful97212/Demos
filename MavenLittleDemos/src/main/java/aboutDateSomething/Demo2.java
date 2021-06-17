package aboutDateSomething;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description  拿月份的时间戳和 拿月份第一天的时间戳是一样的
 * @Version
 * @Date 2021/5/15
 * @Author Gon
 */
public class Demo2
{
    public static void main(String[] args)
    {
        try
        {
            String str = "202105";
            SimpleDateFormat sdf =   new SimpleDateFormat( "yyyyMM" );
            Date date = sdf.parse(str);
            System.out.println(str + ":" + date.getTime());
            String str2 = "20210501";
            SimpleDateFormat sdf2 =   new SimpleDateFormat( "yyyyMMdd" );
            Date date2 = sdf2.parse(str2);
            System.out.println(str2 + ":" + date2.getTime());
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
    }
}
