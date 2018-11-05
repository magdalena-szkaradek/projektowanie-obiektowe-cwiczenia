package wzorce.singleton;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class SkrzynkaPocztowa {
    private static SkrzynkaPocztowa skrzynkaPocztowa = new SkrzynkaPocztowa();
    private Wiadomosc odebranaWiadomosc = new Wiadomosc("Stara wiadomość", "Nadawca", LocalDateTime.now());
    Map<Class, Boolean> zalogowanyPerKlientPocztowy = new HashMap<>();

    private String adres = "adres";
    private String haslo = "haslo";

    private SkrzynkaPocztowa() {
    }

    public void wyslijWiadomosc(Wiadomosc wiadomosc) {
        odebranaWiadomosc = wiadomosc;
        System.out.println("Wysłałem wiadomość : " + wiadomosc.tekstWiadomosci + " " + wiadomosc.nadawca + " " + wiadomosc.dataPrzeslania);
    }


    public void zaloguj(Class className, String adres, String haslo) {
        if (zalogowanyPerKlientPocztowy.containsKey(className)) {
            if (!zalogowanyPerKlientPocztowy.get(className)) {
                if (Objects.equals(adres, this.adres) && Objects.equals(haslo, this.haslo)) {
                    System.out.println("Zalogowano");
                    zalogowanyPerKlientPocztowy.put(className, true);
                } else {
                    System.out.println("Nieprawidłowe dane");
                }
            }
        } else {
            zalogowanyPerKlientPocztowy.put(className, false);
            zaloguj(className, adres, haslo);
        }
    }

    public static SkrzynkaPocztowa getInstance() {
        return skrzynkaPocztowa;
    }

    public void odbierzWiadomosc() {
        System.out.println("Odebrałem wiadomość: " + odebranaWiadomosc.tekstWiadomosci + " " + odebranaWiadomosc.nadawca + " " + odebranaWiadomosc.dataPrzeslania);
    }

}
