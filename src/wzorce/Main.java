package wzorce;

public class Main {

    public static void main(String[] args) {
        Baza baza;
        baza = new Tort();
        baza = new OrzechyDecorator(baza);
        System.out.println(baza.toString());


        baza = new PolewaDecorator(baza);
        System.out.println(baza.toString());


        Baza babeczka;
        babeczka = new Babeczka();
        babeczka = new PolewaDecorator(babeczka);
        babeczka = new OrzechyDecorator(babeczka);
        System.out.println(babeczka.toString());
    }
}
