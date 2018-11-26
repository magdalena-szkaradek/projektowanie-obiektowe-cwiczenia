package wzorce.decorator;

public class OrzechyDecorator extends CiastoDecorator {
    private static final Double CENA_ZA_TORT = 15.00;
    private static final Double CENA_ZA_BABECZKE = 2.00;


    private final Baza baza;

    OrzechyDecorator(Baza baza) {
        super(baza);
        this.baza = baza;
    }

    @Override
    public String pobierzBaze() {
        return baza.pobierzBaze();
    }

    @Override
    public String pobierzOpis() {
        return baza.pobierzOpis() + ", orzechy";
    }

    @Override
    protected Double pobierzCeneZaBabeczke() {
        return CENA_ZA_BABECZKE;
    }

    @Override
    protected Double pobierzCeneZaTort() {
        return CENA_ZA_TORT;
    }

    @Override
    public double liczCene() {
        return baza.liczCene() + pobierzCeneZaDodatek();
    }

}
