package wzorce.facade;

public class SwiatlaWMieszkaniach implements ISwiatla {

    @Override
    public void zapalSwiatla() {
        System.out.println("Swiatla w mieszkaniach zapalone");
    }

    @Override
    public void zgasSwiatla() {
        System.out.println("Swiatla w mieszkaniach zgaszone");
    }
}
