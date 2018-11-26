package wzorce.decorator;

public class Babeczka extends Baza{
    Babeczka(){
        opis = "Babeczka podstawowa";
    }

    @Override
    public double liczCene(){
        return 5.00;
    }

    @Override
    public String pobierzBaze() {
        return "Babeczka";
    }
}
