package practice4;

public class GreenApplesFactory extends AbstractFabric {
    @Override
    public Fruit makeFruit() {
        return new Apple(random.nextInt(100) + 100, Color.GREEN);
    }
}
