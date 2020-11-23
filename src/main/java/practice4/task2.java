package practice4;

import java.util.Arrays;
import java.util.Random;

public class task2 {
    static final int COUNT_FABRIC = 10;
    static final int COUNT_FRUIT = 20;

    public static void main(String[] args) {
        AbstractFabric[] fabrics = new AbstractFabric[COUNT_FABRIC];
        Random random = new Random();
        for (int i = 0; i < COUNT_FABRIC; i++) {
            int rand = random.nextInt(4);
            if (rand == 0) {
                fabrics[i] = new ThinOrangeFactory();
            } else if (rand == 1) {
                fabrics[i] = new RedApplesFactory();
            } else if (rand == 2) {
                fabrics[i] = new GreenApplesFactory();
            } else {
                fabrics[i] = new LongPinepplesFactory();
            }
        }

        Fruit[] fruits = new Fruit[COUNT_FRUIT];
        int ifr = 0;
        for (int i = 0; i < COUNT_FABRIC; i++) {
            if (ifr < COUNT_FRUIT) {
                fruits[ifr] = fabrics[i].makeFruit();
                ifr++;
            }
            if (ifr < COUNT_FRUIT) {
                fruits[ifr] = fabrics[i].makeFruit();
                ifr++;
            } else {
                break;
            }
        }
        System.out.println(Arrays.toString(fruits));
    }
}
