package testy;

public class Samochod {

    public int zuzyciePaliwa;
    public int przebieg;
    public int paliwo;
    public static final int CENA_ZA_LITR_PALIWA = 5;

    public void tankuj(int paliwo) {
        this.paliwo = this.paliwo + paliwo;
    }

    public int liczKoszt(int odleglosc) {
        return ((odleglosc * zuzyciePaliwa) / 100) * CENA_ZA_LITR_PALIWA;
    }
}