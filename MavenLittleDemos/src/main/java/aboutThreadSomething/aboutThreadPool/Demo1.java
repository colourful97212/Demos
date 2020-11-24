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
        // 可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。


        //ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        // 可控制线程最大并发数，超出的线程会在队列中等待


        //ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        // 它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。


        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        //定长线程池，支持定时及周期性任务执行。


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
