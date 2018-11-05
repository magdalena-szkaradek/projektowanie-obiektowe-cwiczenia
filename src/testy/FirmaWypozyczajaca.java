package testy;

import java.util.*;

public class FirmaWypozyczajaca implements Samochody {
    public List<Samochod> listaSamochodow = new ArrayList<>();
    public Map<Samochod, Integer> zyskPerSamochod = new LinkedHashMap<>();
    public static final int MARZA = 50;

    @Override
    public int liczZestawienie(Collection<Samochod> samochody) {
        Integer zysk = 0;
        for (Samochod samochod : samochody) {
            if (zyskPerSamochod.containsKey(samochod)) {
                zysk += zyskPerSamochod.get(samochod);
            }
        }
        return zysk;
    }

    @Override
    public void kupPojazd() {
        Samochod samochod = new Samochod();
        listaSamochodow.add(samochod);
    }

    @Override
    public void sprzedajPojazd() {
        if (listaSamochodow.size() > 0) {
            listaSamochodow.remove(0);
        }
    }

    public int wypozyczPojazd(Samochod samochod, int odleglosc) {
        int cenaDoZaplaty = 0;
        if (listaSamochodow.size() > 0) {
            samochod.przebieg += odleglosc;
            samochod.paliwo -= (samochod.zuzyciePaliwa * odleglosc) / 100;
            int koszt = samochod.liczKoszt(odleglosc);
            cenaDoZaplaty = koszt + MARZA;
        }
        zyskPerSamochod.merge(samochod, cenaDoZaplaty, Integer::sum);
        return cenaDoZaplaty;


    }


}
