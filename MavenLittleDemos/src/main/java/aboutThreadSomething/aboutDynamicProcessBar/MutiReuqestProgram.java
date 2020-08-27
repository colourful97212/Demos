package aboutThreadSomething.aboutDynamicProcessBar;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description  多次轮询程序
 * @Version
 * @Date 8/27/2020
 * @Author Gon
 */

@Slf4j
public class MutiReuqestProgram implements Runnable
{
    private boolean controller = true;
    private String key;

    public MutiReuqestProgram(String key)
    {
        this.key = key;
    }

    @Override
    public void run()
    {
        while (controller)
        {
            try
            {
                Thread.sleep(50);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            if (Contentset.GlobalMap.containsKey(key))
            {
                String percent = Contentset.GlobalMap.get(key).getPercent();
                log.info("$$$$$$$$$$$$$$$$::::Current Percent   >>>  " + percent);
            }
        }
    }

    public void stop()
    {
        controller = false;
    }
}
