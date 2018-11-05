package testy;

import org.junit.Test;
import static org.junit.Assert.*;

public class SamochodTest {

    @Test
    public void testTankuj() {
        int paliwo = 10;
        Samochod samochod = new Samochod();
        int iloscPaliwa = samochod.paliwo + paliwo;
        samochod.tankuj(paliwo);
        assertEquals(iloscPaliwa, samochod.paliwo);
    }

    @Test
    public void testLiczKoszt() {
        int odleglosc = 100;
        Samochod samochod = new Samochod();
        int expResult = (odleglosc * samochod.zuzyciePaliwa)/100 * Samochod.CENA_ZA_LITR_PALIWA;
        int result = samochod.liczKoszt(odleglosc);
        assertEquals(expResult, result);
    }
}
