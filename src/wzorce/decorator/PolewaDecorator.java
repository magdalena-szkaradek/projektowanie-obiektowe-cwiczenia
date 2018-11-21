package wzorce.decorator;

public class PolewaDecorator extends CiastoDecorator {
    Double cenaZaTort = 15.00;
    Double cenaZaBabeczke = 2.00;
    Double cenaZaCiasto = 10.00;

    boolean czyTort = false;
    boolean czyBabeczka = false;

    public PolewaDecorator(Baza baza){
        super(baza);
        if(baza instanceof Tort){
            this.czyTort = true;
        }else if(baza instanceof Babeczka){
            this.czyBabeczka = true;
        }
    }

    @Override
    public String getDescription(){
        return baza.getDescription() + ", polewa";
    }

    @Override
    public double price(){
        if(czyTort){
            return baza.price() + cenaZaTort;
        }else if(czyBabeczka){
            return baza.price() + cenaZaBabeczke;
        }
        return baza.price() + cenaZaCiasto;
    }
}
