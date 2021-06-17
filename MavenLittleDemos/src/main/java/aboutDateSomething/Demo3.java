package aboutDateSomething;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Version
 * @Date 2021/5/15
 * @Author Gon
 */
public class Demo3
{
    public static void main(String[] args)
    {

        try
        {
            String str = "199009";
            String str2 = "202008";
            SimpleDateFormat sdf =   new SimpleDateFormat( "yyyyMM" );
            Date date = sdf.parse(str);
            Date date2 = sdf.parse(str2);
            System.out.println(str + ":" + date.getTime());
            System.out.println(str2 + ":" + date2.getTime());
            long birthday = date.getTime();
            long time = date2.getTime();
            long year = time -birthday;
            System.out.println(year);
            long age = year / (365 * 24 * 60 * 60 * 1000L);
            System.out.println(year);
            System.out.println(age);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
    }
}
