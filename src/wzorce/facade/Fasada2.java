package wzorce.facade;

public class Fasada2 {
    public static void main(String[] args) {
        ApplicationFasada sterowanie = new ApplicationFasada();
        sterowanie.otworzMieszkania();
        sterowanie.otworzDrzwi();
        sterowanie.zapalSwiatla();
        sterowanie.wlaczKlimatyzacje();
        sterowanie.zgasSwiatla();
        sterowanie.wylaczKlimatyzacje();
        sterowanie.zamknijDrzwi();
        sterowanie.zamknijMieszkania();
    }
}
