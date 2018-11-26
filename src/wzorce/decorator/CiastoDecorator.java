package wzorce.decorator;


public abstract class CiastoDecorator extends Baza {
    protected Baza baza;

    CiastoDecorator(Baza baza) {
        this.baza = baza;
    }

    @Override
    public abstract String pobierzOpis();

    Double pobierzCeneZaDodatek() {
        switch (pobierzBaze()) {
            case "Tort":
                return pobierzCeneZaTort();
            case "Babeczka":
                return pobierzCeneZaBabeczke();
            default:
                throw new IllegalStateException();
        }
    }


    protected abstract Double pobierzCeneZaBabeczke();

    protected abstract Double pobierzCeneZaTort();
}
