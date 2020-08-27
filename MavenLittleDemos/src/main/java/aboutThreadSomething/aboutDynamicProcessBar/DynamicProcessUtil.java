package aboutThreadSomething.aboutDynamicProcessBar;

/**
 * @Description
 * @Version
 * @Date 8/27/2020
 * @Author Gon
 */
public class DynamicProcessUtil
{
    public static void dynamicIncrease(String fromPercent, String toPercent, String key)
    {
        //调用该方法时，如果上一个线程没有停止则正常停止后将进度拉到toPercent，如果已经停止将toPercent -1拉到toPercent
        if (Contentset.GlobalThreadMap.containsKey(key))
        {
            Contentset.GlobalThreadMap.get(key).stop();
        }

        ThreadPercent runnable = new ThreadPercent(fromPercent, toPercent, key);
        Thread thread = new Thread(runnable);
        thread.start();

        //线程开启后将该Runable的实现类计入全局Map
        Contentset.GlobalThreadMap.put(key, runnable);
    }

    public static void end(String key)
    {
        Contentset.GlobalThreadMap.get(key).stop();
    }
}
