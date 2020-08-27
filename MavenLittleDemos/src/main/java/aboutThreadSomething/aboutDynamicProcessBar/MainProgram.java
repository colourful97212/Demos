package aboutThreadSomething.aboutDynamicProcessBar;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description  轮询实现动态进度  主程序进度
 * @Version
 * @Date 8/27/2020
 * @Author Gon
 */

@Slf4j
public class MainProgram
{
    public static void main(String[] args)
    {
        String key = "testDynamicPercentBarByManyTimes";

        //启动轮询程序
        MutiReuqestProgram runnable = new MutiReuqestProgram(key);
        Thread thread = new Thread(runnable);
        thread.start();
        try
        {
            //模拟主程序启动
            log.info("############################################");
            log.info("##################::First::#################");
            log.info("############################################");
            DynamicProcessUtil.dynamicIncrease("0","20",key);
            Thread.sleep(3000);
            log.info("############################################");
            log.info("##################::Second::#################");
            log.info("############################################");
            DynamicProcessUtil.dynamicIncrease("20","40",key);
            Thread.sleep(3000);
            log.info("############################################");
            log.info("##################::Third::#################");
            log.info("############################################");
            DynamicProcessUtil.dynamicIncrease("40","60",key);
            Thread.sleep(3000);
            log.info("############################################");
            log.info("##################::Fourth::#################");
            log.info("############################################");
            DynamicProcessUtil.dynamicIncrease("60","80",key);
            Thread.sleep(3000);
            log.info("############################################");
            log.info("##################::Fifth::#################");
            log.info("############################################");
            DynamicProcessUtil.dynamicIncrease("80","100",key);
            Thread.sleep(3000);

            DynamicProcessUtil.end(key);
            Thread.sleep(1000);

            //停止轮询程序
            runnable.stop();
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
