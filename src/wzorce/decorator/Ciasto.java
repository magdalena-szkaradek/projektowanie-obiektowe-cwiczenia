package wzorce.decorator;

public class Ciasto extends CiastoBaza{
    String kategoria = "Zwykle Ciasto";
    Integer cenaBazowa = 20;
    Integer cenaCalkowita = cenaBazowa;


    String opisz(){
        return "Nazwa: " + this.kategoria + " Cena bazowa: " + cenaBazowa + " Cena calkowita: " + cenaCalkowita;
    }
}
