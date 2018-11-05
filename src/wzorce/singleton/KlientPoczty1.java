package wzorce.singleton;

public class KlientPoczty1 {
    private SkrzynkaPocztowa singleton = SkrzynkaPocztowa.getInstance();

    public void wyslijWiadomosc(Wiadomosc wiadomosc) {
        if (czyZalogowany()) {
            singleton.wyslijWiadomosc(wiadomosc);
        } else {
            System.out.println("Uzytkownik niezalogowany - nie można wysłać wiadomości");
        }
    }

    public void odbierzWiadomosc() {
        if (czyZalogowany()) {
            singleton.odbierzWiadomosc();
        } else {
            System.out.println("Uzytkownik niezalogowany - nie można odebrać wiadomości");
        }
    }

    public void zaloguj(String adres, String haslo) {
        singleton.zaloguj(KlientPoczty1.class, adres, haslo);
    }

    private Boolean czyZalogowany() {
        return singleton.zalogowanyPerKlientPocztowy.get(KlientPoczty1.class) != null ? singleton.zalogowanyPerKlientPocztowy.get(KlientPoczty1.class) : false;
    }
}

