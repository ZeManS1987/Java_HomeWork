package HomeWork3;

public class Fern extends Plant implements CanBloom{

    public Fern(String name) {
        super(name);
    }

    public void canBloom() {
        System.out.println(name + " : умеет цвести");
    }
}
