package wzorce.facade;

public class DrzwiMieszkanie1 implements IDrzwi {

    @Override
    public void zamknijDrzwi() {
        System.out.println("Drzwi w mieszkaniu 1 zamknięte");
    }

    @Override
    public void otworzDrzwi() {
        System.out.println("Drzwi w mieszkaniu 1 otwarte");
    }

    @Override
    public void otworzMieszkanie() {
        System.out.println("Mieszkanie 1 otwarte");
    }

    @Override
    public void zamknijMieszkanie() {
        System.out.println("Mieszkanie 1 zamkniete");
    }
}
