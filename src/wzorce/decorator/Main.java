package wzorce.decorator;

public class Main {

    public static void main(String[] args) {
        CiastoBaza ciasto = new Tort();
        ciasto = new Owoce(ciasto);
        ciasto = new Polewa(ciasto);
        System.out.println(ciasto.opisz());
    }


}
