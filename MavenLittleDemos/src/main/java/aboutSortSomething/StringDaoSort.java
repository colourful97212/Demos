package aboutSortSomething;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Description
 * @Version
 * @Date 7/13/2020
 * @Author Gon
 */
public class StringDaoSort
{
    public static void main(String[] args)
    {
        String str = "2";
        String str2 = "99";
        String str6 = "13";
        String str7 = "1900";

        System.out.println(str.compareTo(str2));//-1 1<10
        System.out.println(str.compareTo(str6));
        System.out.println(str.compareTo(str7));//如果首字符一样的话则比较长度

        String str3 = "abcd";
        String str8 = "az";

        System.out.println(str3.compareTo(str8));

        String str4 = "bcda";
        String str5 = "dabc";
        System.out.println(str3.compareTo(str4));//-1

        System.out.println(str3.compareTo(str5));//-3 可见compareTo方法比较字符串时受首字母的ascii码影响

        System.out.println((int)str3.toCharArray()[0]);//a
        System.out.println((int)str5.toCharArray()[0]);//d
        System.out.println((int)str.toCharArray()[0]);//1
        System.out.println((int)str2.toCharArray()[0]);//9



        String strg1 = "2";
        String strg2 = "19";
        System.out.println(strg1.compareTo(strg2));

        //比较Integer
        Integer i = 2;
        Integer j = 19;
        System.out.println(i.compareTo(j));
    }
}
