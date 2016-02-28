package javatar;

import org.junit.Test;

import java.io.File;

import static javatar.service.AztecCodeReader.readAztecCode;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class AztecCodeReaderTest {

    @Test
    public void should_fail_for_wrong_file(){
        String result = readAztecCode(new File("bffd.png"));

        assertThat(result, is(equalTo("Błędna ścieżka do pliku")));
    }

    @Test
    public void should_read_aztec_file(){
        String result = readAztecCode(new File(getClass().getClassLoader().getResource("aztec.png").getFile()));

        assertThat(result, is(equalTo("fdsfsdf fsdfsd\r\ngfdgdfgjuhg df\r\ngdfg")));

    }
}
