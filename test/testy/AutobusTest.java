package testy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutobusTest {

    @Test
    public void testLiczZysk() {
        int pasazerowie = 20;
        Autobus instance = new Autobus();
        int expResult = pasazerowie * instance.cenaBiletu;
        int result = instance.liczZysk(pasazerowie);
        assertEquals(expResult, result);
    }
}
