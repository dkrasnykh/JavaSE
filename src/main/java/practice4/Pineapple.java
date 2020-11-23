package practice4;

public class Pineapple extends Fruit {
    private int tailHeight;

    public Pineapple(int weight, int tailHeight) {
        super(weight);
        this.tailHeight = tailHeight;
    }

    @Override
    public String toString() {
        return "Pineapple{" +
                "weight=" + weight + "; " +
                "tail height=" + tailHeight +
                '}';
    }
}
