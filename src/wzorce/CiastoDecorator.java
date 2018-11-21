package wzorce;


public abstract class CiastoDecorator extends Baza{
    protected Baza baza;

    public CiastoDecorator(Baza baza){
        this.baza = baza;
    }

    @Override
    public abstract String getDescription();
}
