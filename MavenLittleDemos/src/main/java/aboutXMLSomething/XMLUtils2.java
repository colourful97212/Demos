package aboutXMLSomething;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;

/**
 * @Description
 * @Version
 * @Date 8/12/2020
 * @Author Gon
 */
public class XMLUtils2
{
    public static String parserXml(File file)
    {
        try
        {
            SAXReader reader = new SAXReader();
            Document document = reader.read(file);
            Element root = document.getRootElement();

            Iterator it = root.elementIterator();
            while (it.hasNext()) {
                Element element = (Element) it.next();

               //    System.out.println("fs.defaultFS: " + element.attributeValue("property"));
//
//
                System.out.println("name: " + element.elementText("name"));
                System.out.println("value: " + element.elementText("value"));
//                System.out.println();

                if (element.elementText("name").equals("fs.defaultFS"))
                {
                    String value = element.elementText("value");
                    System.out.println("GONGLIGE:::" + value);
                    System.out.println("GONGLIGE:::" + value);
                    System.out.println("GONGLIGE:::" + value);
                    System.out.println("GONGLIGE:::" + value);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args)
    {
//        String str = parserXml(new File("E:\\core-site.xml"));
//        System.out.println(str);
        String str = "hdfs://HDP-1:8020";
        System.out.println(str.indexOf("//"));
        System.out.println(str.indexOf(":"));
        System.out.println(str.substring(str.indexOf("//")+2, str.lastIndexOf(":")));

    }
}
