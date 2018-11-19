package wzorce.decorator;

import java.util.Objects;

public class Owoce extends CiastoDekorator{
    Ciasto ciasto;
    Tort tort;
    private String nazwaDodatku = "Owoce";
    private Integer cenaZaTort = 20;
    private Integer cenaZaCiasto = 10;
    private boolean czyTort = false;

    Owoce(Ciasto ciasto){
        this.ciasto = ciasto;
    }

    Owoce(Tort tort){
        this.tort = tort;
    }


    public void dodajOwoce(Class className){
        if(Objects.equals(className, CiastoBaza.class)){
            czyTort = false;
            ciasto.cenaCalkowita += cenaZaCiasto;
        }else {
            czyTort = true;
            tort.cenaCalkowita += cenaZaTort;
        }
    }

    public String opisz(){
        if(czyTort){
            return tort.opisz() + " dodatek: " + nazwaDodatku;
        }
        else{
            return ciasto.opisz() + " dodatek: " + nazwaDodatku;
        }
    }
}
