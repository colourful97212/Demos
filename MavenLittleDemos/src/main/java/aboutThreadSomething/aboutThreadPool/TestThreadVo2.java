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
public class TestThreadVo2 implements Runnable
{
    private int i = 0;
    private boolean controller = true;

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
            log.info("########################## [i] -> ["+ i +"] ##########################");
        }
    }

    public void stop()
    {
        controller = false;
    }
}
