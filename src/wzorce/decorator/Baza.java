package wzorce.decorator;

public abstract class Baza {
    String opis;

    public abstract double liczCene();

    public abstract String pobierzBaze();

    public String pobierzOpis() {
        return opis;
    }

    @Override
    public String toString() {
        return liczCene() + "(" + pobierzOpis() + ")";
    }
}
