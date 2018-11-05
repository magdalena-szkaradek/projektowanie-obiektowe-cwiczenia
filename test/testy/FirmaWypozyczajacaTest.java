package testy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirmaWypozyczajacaTest {
    private final static int MARZA = 50;
    private final static int ODLEGLOSC = 100;

    @Test
    public void testWypozyczPojazd() {
        Samochod samochod = new Samochod();
        int przebiegPrzed = samochod.przebieg;
        int paliwoPrzed = samochod.paliwo;
        FirmaWypozyczajaca firmaWypozyczajaca = new FirmaWypozyczajaca();
        firmaWypozyczajaca.listaSamochodow.add(samochod);

        int cenaZaPojazd = firmaWypozyczajaca.wypozyczPojazd(samochod, ODLEGLOSC);

        assertEquals(cenaZaPojazd, samochod.liczKoszt(ODLEGLOSC) + MARZA);
        assertEquals(przebiegPrzed + ODLEGLOSC, samochod.przebieg);
        assertEquals(paliwoPrzed + (samochod.zuzyciePaliwa * ODLEGLOSC) / 100, samochod.paliwo);
    }

    @Test
    public void testLiczZestawienie() {
        FirmaWypozyczajaca firmaWypozyczajaca = new FirmaWypozyczajaca();
        Samochod samochod = new Samochod();
        Samochod samochod2 = new Samochod();
        firmaWypozyczajaca.listaSamochodow.add(samochod);
        firmaWypozyczajaca.listaSamochodow.add(samochod2);
        int expResult = firmaWypozyczajaca.wypozyczPojazd(samochod, ODLEGLOSC);
        expResult += firmaWypozyczajaca.wypozyczPojazd(samochod2, ODLEGLOSC);
        int result = firmaWypozyczajaca.liczZestawienie(firmaWypozyczajaca.listaSamochodow);
        assertEquals(expResult, result);
    }

    @Test
    public void testKupPojazd() {
        Samochod samochod = new Samochod();
        FirmaWypozyczajaca firmaWypozyczajaca = new FirmaWypozyczajaca();
        firmaWypozyczajaca.listaSamochodow.add(samochod);
        int iloscSamochodowPrzed = firmaWypozyczajaca.listaSamochodow.size();
        firmaWypozyczajaca.kupPojazd();
        assertEquals(iloscSamochodowPrzed + 1, firmaWypozyczajaca.listaSamochodow.size());
    }

    @Test
    public void testSprzedajPojazd() {
        FirmaWypozyczajaca firmaWypozyczajaca = new FirmaWypozyczajaca();
        Samochod samochod = new Samochod();
        firmaWypozyczajaca.listaSamochodow.add(samochod);
        int iloscSamochodowPrzed = firmaWypozyczajaca.listaSamochodow.size();
        firmaWypozyczajaca.sprzedajPojazd();
        assertEquals(iloscSamochodowPrzed - 1, firmaWypozyczajaca.listaSamochodow.size());
    }
}
