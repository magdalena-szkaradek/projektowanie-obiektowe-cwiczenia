package wzorce.decorator;

public class Owoce extends CiastoDekorator {
    CiastoBaza ciasto;
    private String nazwaDodatku = "Owoce";
    private Integer cenaZaTort = 20;
    private Integer cenaZaCiasto = 10;

    Owoce(CiastoBaza ciasto) {
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
