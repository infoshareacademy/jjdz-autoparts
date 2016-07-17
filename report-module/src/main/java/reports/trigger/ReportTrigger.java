package reports.trigger;

import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class ReportTrigger {

    @Schedule(second = "*",  hour = "*/2", minute = "*")
    public void run(){

    }


}
