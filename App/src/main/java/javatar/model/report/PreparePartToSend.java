package javatar.model.report;

import com.google.gson.Gson;
import javatar.model.FormData;

public class PreparePartToSend {

    public String getPartJson(FormData formData) {
        PartForReportModule part = new PartForReportModule(formData);

        Gson gson = new Gson();
        return gson.toJson(part);
    }
}
