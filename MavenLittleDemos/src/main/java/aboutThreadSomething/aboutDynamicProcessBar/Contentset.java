package aboutThreadSomething.aboutDynamicProcessBar;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Version
 * @Date 8/27/2020
 * @Author Gon
 */
public class Contentset
{
    //主线程进度往这里写
    public static Map<String, PercentageVo> GlobalMap = new HashMap<>();

    //用key获得需要跟新ThreadPercent
    public static Map<String, ThreadPercent> GlobalThreadMap = new HashMap<>();
}
