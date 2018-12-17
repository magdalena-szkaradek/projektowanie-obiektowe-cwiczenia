package wzorce.facade;

public class SwiatlaNaKorytarzu implements ISwiatla {

    @Override
    public void zapalSwiatla() {
        System.out.println("Swiatla na korytarzach zapalone");
    }

    @Override
    public void zgasSwiatla() {
        System.out.println("Swiatla na korytarzach zgaszone");
    }
}
