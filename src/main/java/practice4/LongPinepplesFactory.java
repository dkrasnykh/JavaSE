package practice4;

public class LongPinepplesFactory extends AbstractFabric {
    @Override
    public Fruit makeFruit() {
        return new Pineapple(random.nextInt(500) + 1000, random.nextInt(10) + 10);
    }
}
