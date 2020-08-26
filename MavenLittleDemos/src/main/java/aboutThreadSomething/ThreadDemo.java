package aboutThreadSomething;

/**
 * @Description
 * @Version
 * @Date 8/13/2020
 * @Author Gon
 */
public class ThreadDemo implements Runnable
{
    private int i = 0;
    @Override
    public void run()
    {
        //System.out.println("Thread");
        while (true)
        {
            if (Thread.currentThread().isInterrupted())
            {
                break;
            }
            System.out.println("Thread");
        }
    }
}
