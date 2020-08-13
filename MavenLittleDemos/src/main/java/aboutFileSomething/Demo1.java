package aboutFileSomething;

import java.io.File;

/**
 * @Description
 * @Version
 * @Date 8/12/2020
 * @Author Gon
 */
public class Demo1
{
    public static void main(String[] args)
    {
        File file = new File("E:\\hdfs\\hello.txt");
        file.mkdir();
        System.out.println(file.getName());
    }
}
