package structural.adaptor;

public class AdapterTest {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();

        BirdAdapter birdAdapter = new BirdAdapter(sparrow);
        birdAdapter.squeak();
    }
}
