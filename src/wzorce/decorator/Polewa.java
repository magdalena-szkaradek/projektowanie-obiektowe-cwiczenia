package wzorce.decorator;


public class Polewa extends CiastoDekorator {
    CiastoBaza ciasto;
    private String nazwaDodatku = "Polewa";
    private Integer cenaZaTort = 20;
    private Integer cenaZaCiasto = 10;

    Polewa(CiastoBaza ciasto) {
        super();
        this.ciasto = ciasto;
        if (ciasto instanceof Tort) {
            this.ciasto.cenaCalkowita += cenaZaTort;
        } else {
            this.ciasto.cenaCalkowita += cenaZaCiasto;
        }
    }

    public String opisz() {
        return ciasto.opisz() + " dodatek: " + nazwaDodatku;
    }
}
