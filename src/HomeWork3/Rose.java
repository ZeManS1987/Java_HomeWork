package HomeWork3;

public class Rose extends Plant implements CanSmall, CanBloom{

    public Rose(String name) {
        super(name);
    }

    public void canSmall() {
        System.out.println(name + " : умеет пахнуть");
    }

    @Override
    public void canBloom() {
        System.out.println(name + " : умеет цвести");
    }
}
