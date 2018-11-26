package wzorce.decorator;


public abstract class CiastoDecorator extends Baza{
    protected Baza baza;

    CiastoDecorator(Baza baza){
        this.baza = baza;
    }

    @Override
    public abstract String pobierzOpis();
}
