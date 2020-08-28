package aboutThreadSomething.aboutThreadPool;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description
 * @Version
 * @Date 8/28/2020
 * @Author Gon
 */

@Slf4j
@Data
public class TestThreadVo implements Runnable
{
    private TestThreadVo2 testThreadVo2;

    private boolean controller = true;

    public TestThreadVo(TestThreadVo2 testThreadVo2)
    {
        this.testThreadVo2 = testThreadVo2;
    }

    @Override
    public void run()
    {
        while (controller)
        {
            try
            {
                Thread.sleep(500);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            int i = testThreadVo2.getI();
            testThreadVo2.setI(++i);
            log.info("$$$$$$$$$$$$$$$$$$$$$$$ [++i] -> ["+i+"] $$$$$$$$$$$$$$$$$$$$$");
        }
    }

    public void stop()
    {
        testThreadVo2.stop();
        controller = false;
    }
}
