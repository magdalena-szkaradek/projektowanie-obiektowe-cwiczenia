package wzorce.decorator;

import java.util.Objects;

public class Polewa extends CiastoDekorator {
    Ciasto ciasto;
    Tort tort;
    private String nazwaDodatku = "Polewa";
    private Integer cenaZaTort = 20;
    private Integer cenaZaCiasto = 10;
    private boolean czyTort = false;

    Polewa(Ciasto ciasto){
        this.ciasto = ciasto;
    }

    Polewa(Tort tort){
        this.tort = tort;
    }

    void dodajPolewe(Class className){
        if(Objects.equals(className, Ciasto.class)){
            czyTort = false;
            ciasto.cenaCalkowita += cenaZaCiasto;
        }
        if(Objects.equals(className, Tort.class)){
            czyTort = true;
            tort.cenaCalkowita += cenaZaTort;
        }
    }

    public String opisz(){
        if(czyTort) {
            return tort.opisz() + " dodatek: " + nazwaDodatku;
        }else{
            return ciasto.opisz() + " dodatek: " + nazwaDodatku;
        }
    }
}
