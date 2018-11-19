package wzorce.decorator;

public abstract class CiastoBaza {
    String nazwa = "Baza";

    String opisz(){
        return "Nazwa: " + this.nazwa;
    }
}
