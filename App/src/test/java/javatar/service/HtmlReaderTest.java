package javatar.service;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

public class HtmlReaderTest {

    @Test
    public void url_returnes_value() throws Exception {

        String url = "http://infoshareacademycom.2find.ru/api/v2?lang=polish";
        HtmlReader reader = new HtmlReader();

        String readerText = reader.getText(url);

        assertThat("is not empty", readerText, is(notNullValue()));
        assertThat("containes OPEL", readerText.contains("OPEL"), is(true));
    }
}