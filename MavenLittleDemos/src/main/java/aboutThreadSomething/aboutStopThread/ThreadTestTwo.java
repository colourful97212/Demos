package aboutThreadSomething.aboutStopThread;

/**
 * @Description
 * @Version
 * @Date 8/26/2020
 * @Author Gon
 */
public class ThreadTestTwo
{
    public static void main(String[] args) throws InterruptedException
    {
//        ThreadTest threadTest = new ThreadTest();
//        Thread thread = new Thread(threadTest);
//        thread.start();
//        Thread.sleep(5000);
//        System.out.println(thread.isAlive());
//        thread.interrupt();
        ThreadTest3 threadTest3 = new ThreadTest3();
        Thread thread = new Thread(threadTest3);
        thread.start();
        Thread.sleep(5000);
        threadTest3.switcher = false;
    }
}
