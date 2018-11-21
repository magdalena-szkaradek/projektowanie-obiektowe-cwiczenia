package wzorce.decorator;

public class Tort extends CiastoBaza {
    String kategoria = "Tort";

    public Tort() {
        cenaBazowa = 50;
        cenaCalkowita = cenaBazowa;
    }

    String opisz() {
        return "Nazwa: " + this.kategoria + " Cena bazowa: " + cenaBazowa + " Cena calkowita: " + cenaCalkowita;
    }
}
