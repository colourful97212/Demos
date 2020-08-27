package aboutThreadSomething.aboutStopThread;

/**
 * @Description
 * @Version
 * @Date 8/26/2020
 * @Author Gon
 */
public class ThreadTest implements Runnable
{
    private int i =0;
    @Override
    public void run()
    {
        while (!Thread.currentThread().isInterrupted())
        {
            try
            {
                Thread.sleep(500);
            }
            catch (Exception e)
            {
                break;
            }
            System.out.println("GGGG");
            System.out.println(i++);
        }
    }
}
