package wzorce.facade;

public class KlimatyzacjaMieszkania implements IKlimatyzacja {

    @Override
    public void wlaczKlimatyzajce() {
        System.out.println("Klimatyzacja w mieszkaniach wlaczona");
    }

    @Override
    public void wylaczKlimatyzacje() {
        System.out.println("Klimatyzacja w mieszkaniach wylaczona");
    }
}
