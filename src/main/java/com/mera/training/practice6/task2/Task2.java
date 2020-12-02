package com.mera.training.practice6.task2;
/*
- Создайте класс Bycicle, определите у него свойства String modelName; int maxSpeed (от 5 до 50км\ч);
Переопределите equals и hashCode, который используют оба свойства велосипеда.
- Создайте 11 случайных велосипедов и попытайтесь их добавить их в новый экземпляр MyArrayList.
Если какой-то велосипед добавить не получилось - то в лог выведите какой велосипед не добавился.
- Проверьте, что все методы работают правильно:
1. Возьмите случайное число от 0 до 50.
2. Удалите из коллекции все велосипеды со скоростью меньше этого случайного числа.
- Теперь создайте новый экземпляр MyArrayList
- Добавьте в него 10 случайных чисел от 1 до 10
- удалите все четные числа
- Выведите оставшиеся числа на экран.
 */

import com.mera.training.practice6.task1.MyArrayList;
import com.mera.training.practice6.task1.MyArrayStoreException;
import com.mera.training.practice6.task1.MyList;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        MyArrayList<Bicycle> bicycles = new MyArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 11; i++) {
            int speed = random.nextInt(Bicycle.SPEED_LIMIT);
            String model = "model_" + random.nextInt(1000);
            try {
                bicycles.add(new Bicycle(model, speed));
            } catch (MyArrayStoreException e) {
                System.out.println(String.format("Model '%s' bicycle not added", model));
            }
        }
        System.out.println(bicycles);
        int border = random.nextInt(Bicycle.SPEED_LIMIT);
        System.out.println("boundary value (speed) " + border);

        for (Bicycle b : bicycles) {
            if (b != null && b.getMaxSpeed() < border) {
                System.out.println(b + " deleted");
                bicycles.remove(b);
            }
        }
        System.out.println(bicycles);
        System.out.println();

        MyArrayList<Integer> numbers = new MyArrayList<>();
        for (int i = 0; i < MyList.LENGHT; i++) {
            numbers.add(random.nextInt(1000));
        }

        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); ) {
            Integer n = numbers.get(i);
            if (numbers.get(i) != null && n % 2 == 0) {
                System.out.println(n + " deleted");
                numbers.remove(n);
            } else {
                i++;
            }
        }
        System.out.println(numbers);
    }
}
