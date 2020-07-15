package aboutSortSomething;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.*;

/**
 * @Description  对JSONArray排序，本质上是对list排序
 * @Version
 * @Date 7/13/2020
 * @Author Gon
 */
public class JSONArraySortDemo
{
    public static void main(String[] args)
    {
        JSONArray jsonArray = new JSONArray()
        {
            public String toString()
            {
                return this.toJSONString();
            }
        };

        int j = 0;
        for (int i = 0; i < 5; i++)
        {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("name", "colourful9721" + j++);
            jsonObject.put("sort", j++);
            jsonObject.put("date", new Date());
            jsonArray.add(jsonObject);
        }
        System.out.println("未排序：" + jsonArray);

        List<JSONObject> list = new ArrayList<JSONObject>();
        for (int i = 0; i < jsonArray.size(); i++)
        {
            list.add(jsonArray.getJSONObject(i));
        }

        //对jsonarray排序本质上是对list排序
        Collections.sort(list, new Comparator<JSONObject>()
        {
            //实现compare方法
            public int compare(JSONObject o1, JSONObject o2)
            {
                int val = o1.getString("sort").compareTo(o2.getString("sort"));
                System.out.println("compare方法返回值 ：" + val);
                //倒叙
                return -val;
            }
        });

        System.out.println("排序后:" + list);
    }
}
