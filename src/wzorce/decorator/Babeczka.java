package wzorce.decorator;

public class Babeczka extends Baza{
    public Babeczka(){
        description = "Babeczka podstawowa";
    }

    @Override
    public double price(){
        return 5.00;
    }
}
