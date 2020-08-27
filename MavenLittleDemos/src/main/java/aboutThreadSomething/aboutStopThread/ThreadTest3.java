package aboutThreadSomething.aboutStopThread;

/**
 * @Description
 * @Version
 * @Date 8/27/2020
 * @Author Gon
 */
public class ThreadTest3 implements Runnable
{
    public boolean switcher = true;

    private int i = 0;
    @Override
    public void run()
    {
        while (switcher)
        {
            System.out.println(i ++);
            try
            {
                Thread.sleep(500);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
