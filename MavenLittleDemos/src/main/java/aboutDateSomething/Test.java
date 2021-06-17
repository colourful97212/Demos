package aboutDateSomething;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Version
 * @Date 2021/5/13
 * @Author Gon
 */
public class Test
{
    public static void main(String[] args)
    {

        try
        {
            String str = "202105";
            SimpleDateFormat sdf =   new SimpleDateFormat( "yyyyMM" );
            Date date = sdf.parse(str);
            System.out.println(date.getTime());
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
    }
}
