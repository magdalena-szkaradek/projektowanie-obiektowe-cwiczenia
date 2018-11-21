package wzorce.decorator;

public abstract class CiastoBaza {
    String nazwa = "Baza";
    Integer cenaBazowa = 0;
    Integer cenaCalkowita = 0;

    String opisz(){
        return "Nazwa: " + this.nazwa;
    }
}
