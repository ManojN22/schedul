package schedulers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.quartz.CronExpression;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;


public class mymain {
	
	public static void main(String[] args) {
		
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("schedulers");
			EntityManager em = factory.createEntityManager();
			Query q = em.createQuery("select t from Todo t");
	        List<userda> todoList = q.getResultList();
			
		try {
			 
	 
	        JobDetail job = JobBuilder.newJob(objec.class)
	                                  .build();

	    
	        Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("cronTrigger2", "group2")
                    .withSchedule(CronScheduleBuilder.cronSchedule(new CronExpression("0 0 0 1 * ? *")))
                    .build();
	        

	        //schedule the job
	        SchedulerFactory schFactory = new StdSchedulerFactory();
	        Scheduler sch = schFactory.getScheduler();
	        sch.start();
	        sch.scheduleJob(job, trigger);

	     } catch (SchedulerException e) {
	        e.printStackTrace();
	     }
	}

}
