package javatar.model.report;

import com.google.gson.Gson;
import javatar.model.FormData;

public class PreparePartToSend {

    private String partJson;


    public String getPartJson(FormData formData) {
        PartForReportModule part = new PartForReportModule(formData);


        Gson gson = new Gson();
        return gson.toJson(part);

    }

}
