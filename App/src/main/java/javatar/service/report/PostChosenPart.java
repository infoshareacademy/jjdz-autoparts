package javatar.service.report;

import javatar.model.report.PartForReportModule;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class PostChosenPart {

    public void postSearchedValues(PartForReportModule reportPart) {
        URI uri = UriBuilder.fromUri("http://jboss_report:8080/report-module/api/searched/part").build();

        Response post = ClientBuilder.newClient()
                .target(uri)
                .request()
                .acceptEncoding("UTF-8")
                .post(Entity.json(reportPart));


        System.out.println("response = " + post.getStatus());
    }
}
