package schedulers;


import java.util.Date;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class objec  implements Job{

	   public void execute(JobExecutionContext jExeCtx) throws JobExecutionException {
		   
		  
		  
			System.out.println("your bill on "+new Date());
			
			
	   }
	 
}
