package testy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirmaTransportowaTest {
    private final static int ODLEGLOSC = 100;
    private final static int PASAZEROWIE = 100;

    @Test
    public void liczZestawienieAutobusow() {
        FirmaTransportowa firmaTransportowa = new FirmaTransportowa();
        Autobus autobus = new Autobus();
        Autobus autobus2 = new Autobus();

        firmaTransportowa.listaAutobusow.add(autobus);
        firmaTransportowa.listaAutobusow.add(autobus2);

        int zysk = firmaTransportowa.wyruszWTrase(autobus, ODLEGLOSC, PASAZEROWIE);
        zysk += firmaTransportowa.wyruszWTrase(autobus2, ODLEGLOSC, PASAZEROWIE);

        int result = firmaTransportowa.liczZestawienie(firmaTransportowa.listaAutobusow);
        assertEquals(zysk, result);
    }

    @Test
    public void kupPojazd() {
        Autobus autobus = new Autobus();
        FirmaTransportowa firmaTransportowa = new FirmaTransportowa();
        firmaTransportowa.listaAutobusow.add(autobus);
        int iloscAutobusowPrzed = firmaTransportowa.listaAutobusow.size();
        firmaTransportowa.kupPojazd();
        assertEquals(iloscAutobusowPrzed + 1, firmaTransportowa.listaAutobusow.size());
    }

    @Test
    public void sprzedajPojazd() {
        FirmaTransportowa firmaTransportowa = new FirmaTransportowa();
        Autobus autobus = new Autobus();
        firmaTransportowa.listaAutobusow.add(autobus);
        int iloscAutobusowPrzed = firmaTransportowa.listaAutobusow.size();
        firmaTransportowa.sprzedajPojazd();
        assertEquals(iloscAutobusowPrzed - 1, firmaTransportowa.listaAutobusow.size());
    }

    @Test
    public void wyruszWTrase() {
        FirmaTransportowa firmaTransportowa = new FirmaTransportowa();
        Autobus autobus = new Autobus();
        firmaTransportowa.listaAutobusow.add(autobus);
        int zysk = firmaTransportowa.wyruszWTrase(autobus, ODLEGLOSC, PASAZEROWIE);
        int expected = autobus.liczKoszt(ODLEGLOSC) - autobus.liczZysk(PASAZEROWIE);
        assertEquals(expected, zysk);
    }
}