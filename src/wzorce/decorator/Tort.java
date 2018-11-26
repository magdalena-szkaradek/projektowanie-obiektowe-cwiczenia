package wzorce.decorator;


public class Tort extends Baza {

    Tort() {
        opis = "Tort podstawowy";
    }

    @Override
    public double liczCene() {
        return 20.00;
    }

    @Override
    public String pobierzBaze() {
        return "Tort";
    }
}
