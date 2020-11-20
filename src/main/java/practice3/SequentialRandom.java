package practice3;

import java.util.Random;

public class SequentialRandom {
    private static int number;

    static {
        resetRandom();
    }

    public static void resetRandom() {
        number = new Random().nextInt(100);
    }

    public SequentialRandom() {
        number++;
    }

    public int getNumber() {
        return number;
    }
}
