package javatar.model.report;

import javatar.model.FormData;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PreparePartToSendTest {

    @Test
    public void should_return_json_String() throws Exception {

        //given
        FormData formData = new FormData();

        formData.setAllegroLink("abc/abc.html");
        formData.setCarBrand("brand");
        formData.setCarModel("model");
        formData.setCarEngine("engine");
        formData.setEngineLookupString("lookup");
        formData.setPartBrand("partBrand");
        formData.setPartName("partName");
        formData.setPartId("partId");

        //when
        PreparePartToSend preparePartToSend = new PreparePartToSend();
        String partJson = preparePartToSend.getPartJson(formData);

        //then
        assertThat(partJson, is(equalTo("{\"carBrand\":\"brand\",\"carModel\":\"model\",\"carEngine\":\"engine\"," +
                "\"partBrand\":\"partBrand\",\"partId\":\"partId\",\"partName\":\"partName\"," +
                "\"allegroLink\":\"abc/abc.html\"}")));
    }
}