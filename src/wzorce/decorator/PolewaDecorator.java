package wzorce.decorator;

public class PolewaDecorator extends CiastoDecorator {
    private static final Double CENA_ZA_TORT = 15.00;
    private static final Double CENA_ZA_BABECZKE = 2.00;
    private static final Double CENA_ZA_CIASTO = 10.00;

    private final boolean czyTort;
    private final boolean czyBabeczka;

    private final Baza baza;


    PolewaDecorator(Baza baza){
        super(baza);
        this.baza = baza;
        this.czyTort = pobierzBaze().equals("Tort");
        this.czyBabeczka = pobierzBaze().equals("Babeczka");
    }

    @Override
    public String pobierzOpis(){
        return baza.pobierzOpis() + ", polewa";
    }

    @Override
    public double liczCene(){
        if(czyTort){
            return baza.liczCene() + CENA_ZA_TORT;
        }else if(czyBabeczka){
            return baza.liczCene() + CENA_ZA_BABECZKE;
        }
        return baza.liczCene() + CENA_ZA_CIASTO;
    }

    @Override
    public String pobierzBaze() {
        return baza.pobierzBaze();
    }
}
