package wzorce.singleton;

import java.time.LocalDateTime;

public class Test {
    private final static String adres = "adres";
    private final static String haslo = "haslo";

    public static void main(String[] args) {

        KlientPoczty1 klientPoczty1 = new KlientPoczty1();
        KlientPoczty2 klientPoczty2 = new KlientPoczty2();

        klientPoczty1.zaloguj(adres, haslo);
        Wiadomosc wiadomosc = new Wiadomosc("Tekst", "Nadawca - KlientPoczty1", LocalDateTime.now());
        klientPoczty1.wyslijWiadomosc(wiadomosc);

        klientPoczty2.zaloguj(adres, haslo);
        klientPoczty2.odbierzWiadomosc();


        Wiadomosc wiadomoscOdKlienta2 = new Wiadomosc("Tekst", "Nadawca - KlientPoczty2", LocalDateTime.now());
        klientPoczty2.wyslijWiadomosc(wiadomoscOdKlienta2);
        klientPoczty1.odbierzWiadomosc();
    }
}
