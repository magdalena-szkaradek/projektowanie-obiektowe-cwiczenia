package wzorce.decorator;


public class Tort extends Baza{

    public Tort(){
        description = "Tort podstawowy";
    }

    @Override
    public double price(){
        return 20.00;
    }
}
