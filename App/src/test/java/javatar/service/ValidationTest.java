package javatar.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidationTest {
    @Test
    public void isInteger() throws Exception {

        String s = "abcd";
        String n = "1234";
        String sn ="123abc1234";

        assertEquals(Validation.isInteger(s),false);
        assertEquals(Validation.isInteger(n),true);
        assertEquals(Validation.isInteger(sn),false);

    }

}