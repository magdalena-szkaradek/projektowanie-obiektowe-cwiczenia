package wzorce.facade;

public class KlimatyzacjaNaKorytarzu implements IKlimatyzacja {

    @Override
    public void wlaczKlimatyzajce() {
        System.out.println("Klimatyzacja na korytarzu wlaczona");
    }

    @Override
    public void wylaczKlimatyzacje() {
        System.out.println("Klimatyzacja na korytarzu wylaczona");
    }
}
