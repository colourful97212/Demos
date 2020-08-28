package aboutThreadSomething.aboutThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Description
 * @Version
 * @Date 8/28/2020
 * @Author Gon
 */
public class Demo1
{
    public static void main(String[] args)
    {
        //ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        //ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        //ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        TestThreadVo2 testThreadVo2 = new TestThreadVo2();
        TestThreadVo testThreadVo = new TestThreadVo(testThreadVo2);

        scheduledThreadPool.submit(testThreadVo2);
        scheduledThreadPool.schedule(testThreadVo,500, TimeUnit.MILLISECONDS);

        try
        {
            Thread.sleep(10000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        testThreadVo.stop();
    }
}
