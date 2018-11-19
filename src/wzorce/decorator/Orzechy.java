package wzorce.decorator;

import java.util.Objects;

public class Orzechy extends CiastoDekorator{
    Ciasto ciasto;
    Tort tort;

    private Integer cenaZaTort = 10;
    private Integer cenaZaCiasto = 5;
    private String nazwaDodatku = "orzechy";
    private boolean czyTort = false;


    Orzechy(Ciasto ciasto){
        this.ciasto = ciasto;
    }

    Orzechy(Tort tort){
        this.tort = tort;
    }

    void dodajOrzechy(Class className){
        if(Objects.equals(className, Ciasto.class)){
            czyTort = false;
            ciasto.cenaCalkowita += this.cenaZaCiasto;
        }else{
            czyTort = true;
            tort.cenaCalkowita += this.cenaZaTort;
        }
    }

    String opisz(){
        if(czyTort){
            return tort.opisz() + " dodatek: " + nazwaDodatku;
        }else{
            return ciasto.opisz() + " dodatek: " + nazwaDodatku;
        }
    }

}
