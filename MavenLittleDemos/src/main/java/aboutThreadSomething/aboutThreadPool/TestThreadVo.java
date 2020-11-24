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

    public static void main(String[] args)
    {
        String str = "<br>大数据组件基础开始检测<br>大数据组件基础配置检测完成<br>跳过大数据组件上传步骤";
        System.out.println(str.substring(0, str.lastIndexOf("<br>")));
    }
}
