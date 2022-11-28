package HomeWork3;

public class Spruce extends Wood implements CanSmall{


    public Spruce(String name) {
        super(name);
    }

    public void canSmall() {
        System.out.println(name + " : умеет пахнуть");
    }

    @Override
    public void hasBamps() {

    }
}
