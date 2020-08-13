package aboutQuartzSomething;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @Description
 * @Version
 * @Date 7/30/2020
 * @Author Gon
 */
public class MyScheduler
{
    public void quartz() throws SchedulerException
    {
        StdSchedulerFactory factory = new StdSchedulerFactory();
        Scheduler scheduler = factory.getScheduler();

        scheduler.start();

//        JobDetail job = newJob(MyJob.class)
//                .withIdentity("myJob", "group1")
//                .build();
    }
}
