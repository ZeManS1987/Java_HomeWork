package HomeWork3;
import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        canSmallExample();
        canBloomExample();
    }

    public static void canSmallExample() {
        Pine pine = new Pine("сосна");
        Spruce spruce = new Spruce("ель");
        Rose rose = new Rose("роза");

        CanSmall[] smalls = {pine, spruce, rose};
        for (CanSmall small : smalls){
            small.canSmall();
        }
    }
    public static void canBloomExample() {
        Rose rose = new Rose("роза");
        Fern fern = new Fern("папоротник");

        CanBloom[] blooms = {rose, fern};
        for (CanBloom bloom : blooms){
            bloom.canBloom();
        }
    }
}
