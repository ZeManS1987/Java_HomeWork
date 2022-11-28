package HomeWork3;

public class Pine extends Wood implements CanSmall{

    public Pine(String name) {
        super(name);
    }

    public void canSmall() {
        System.out.println(name + " : умеет пахнуть");
    }

    @Override
    public void hasBamps() {

    }
}
