package aboutThreadSomething.aboutDynamicProcessBar;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description
 * @Version
 * @Date 8/27/2020
 * @Author Gon
 */

@Slf4j
public class ThreadPercent implements Runnable
{
    private int fromPercent;
    private int toPercent;
    private String key;
    private boolean controller = true;

    public ThreadPercent(String fromPercent, String toPercent, String key)
    {
        this.fromPercent = Integer.parseInt(fromPercent);
        this.toPercent = Integer.parseInt(toPercent);
        this.key = key;
    }

    @Override
    public void run()
    {
        //控制器为false时或者进度到达toPercent - 1时线程正常停止
        while (controller && fromPercent < toPercent - 1)
        {
            PercentageVo percentageVo;
            fromPercent ++;
            log.info("###############PERCENTAGE::"+fromPercent+"###############");
            if (Contentset.GlobalMap.containsKey(key))
            {
                percentageVo = Contentset.GlobalMap.get(key);
            }
            else
            {
                percentageVo = new PercentageVo();
            }
            Contentset.GlobalMap.put(key, percentageVo.setPercent(String.valueOf(fromPercent)));
            try
            {
                Thread.sleep(100);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public void stop()
    {
        //正常退出标识
        controller = false;

        //将进度更新到toPercent
        Contentset.GlobalMap.put(key, new PercentageVo().setPercent(String.valueOf(toPercent)));

        //将map中的ThreadPercent清出
        Contentset.GlobalThreadMap.remove(key);
    }
}
