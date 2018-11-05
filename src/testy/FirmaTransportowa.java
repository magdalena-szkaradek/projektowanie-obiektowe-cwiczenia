package testy;

import java.util.*;

public class FirmaTransportowa implements Samochody {
    public List<Samochod> listaAutobusow = new ArrayList<>();
    public Map<Samochod, Integer> zyskPerAutobus = new LinkedHashMap<>();

    @Override
    public int liczZestawienie(Collection<Samochod> autobusy) {
        Integer zysk = 0;
        for (Samochod autobus : autobusy) {
            if (zyskPerAutobus.containsKey(autobus)) {
                zysk += zyskPerAutobus.get(autobus);
            }
        }
        return zysk;
    }

    public void kupPojazd() {
        listaAutobusow.add(new Autobus());
    }

    public void sprzedajPojazd() {
        listaAutobusow.remove(0);
    }

    public int wyruszWTrase(Autobus autobus, int odleglosc, int pasazerowie) {
        int koszt = autobus.liczKoszt(odleglosc);
        Integer zysk = autobus.liczZysk(pasazerowie) - koszt;
        zyskPerAutobus.merge(autobus, zysk, Integer::sum);
        return zysk;
    }
}
