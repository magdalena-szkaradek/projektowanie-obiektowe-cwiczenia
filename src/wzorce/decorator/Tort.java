package wzorce.decorator;

public class Tort extends CiastoBaza {
    String kategoria = "Tort";
    Integer cenaBazowa = 50;
    Integer cenaCalkowita = cenaBazowa;


    String opisz(){
        return "Nazwa: " + this.kategoria + " Cena bazowa: " + cenaBazowa + " Cena calkowita: " + cenaCalkowita;
    }
}
