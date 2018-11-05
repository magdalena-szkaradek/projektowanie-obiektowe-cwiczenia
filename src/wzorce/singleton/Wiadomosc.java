package wzorce.singleton;

import java.time.LocalDateTime;

public class Wiadomosc {
    String tekstWiadomosci;
    String nadawca;
    LocalDateTime dataPrzeslania;

    public Wiadomosc(String tekstWiadomosci, String nadawca, LocalDateTime dataPrzeslania) {
        this.tekstWiadomosci = tekstWiadomosci;
        this.nadawca = nadawca;
        this.dataPrzeslania = dataPrzeslania;
    }
}
