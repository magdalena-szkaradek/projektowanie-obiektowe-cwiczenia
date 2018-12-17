package wzorce.facade;

public class DrzwiMieszkanie2 implements IDrzwi {

    @Override
    public void zamknijDrzwi() {
        System.out.println("Drzwi w mieszkaniu 2 zamknięte");
    }

    @Override
    public void otworzDrzwi() {
        System.out.println("Drzwi w mieszkaniu 2 otwarte");
    }

    @Override
    public void otworzMieszkanie() {
        System.out.println("Mieszkanie 2 otwarte");
    }

    @Override
    public void zamknijMieszkanie() {
        System.out.println("Mieszkanie 2 zamkniete");
    }
}
