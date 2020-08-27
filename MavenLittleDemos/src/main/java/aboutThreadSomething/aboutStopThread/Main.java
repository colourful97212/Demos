package aboutThreadSomething.aboutStopThread;

/**
 * @Description
 * @Version
 * @Date 8/13/2020
 * @Author Gon
 */
public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        ThreadDemo threadDemo = new ThreadDemo();
        Thread thread = new Thread(threadDemo);
        thread.start();

        Thread.sleep(1000);
        System.out.println(thread.isAlive());
        thread.interrupt();
    }
}
