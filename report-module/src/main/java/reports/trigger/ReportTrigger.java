package reports.trigger;

import javax.ejb.Schedule;
import javax.ejb.Startup;
import javax.ejb.Stateless;

@Stateless
@Startup
public class ReportTrigger {

    @Schedule(second = "*/5",  hour = "*", minute = "*")
    public void run(){
        System.out.println("test");
    }


}
