package aboutXMLSomething;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;

/**
 * @Description
 * @Version
 * @Date 8/10/2020
 * @Author Gon
 */
public class XMLUtils
{
    public static File coreFile = new File("E:\\core-site.xml");
    public static File hdfsFile = new File("E:\\hdfs-site.xml");
    public static File emptyFile = new File("E:\\emptyFile.xml");

    public void parseXML()
    {
        try
        {
            SAXReader saxReader = new SAXReader();
            Document document = saxReader.read(coreFile);
            Element employees = document.getRootElement();
            for (Iterator i = employees.elementIterator(); i.hasNext();)
            {
                //employees.
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        System.out.println(100/3*3);
    }
}
