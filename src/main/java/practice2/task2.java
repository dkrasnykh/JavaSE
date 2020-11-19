package practice2;
/*
Задание 2. Случайности расходятся
- Создать массив на 5 элементов типа int и вывести на экран
- Разделить на два других - в первом массиве только четные числа, во втором - только нечетные. Оба массива вывести на экран.
- Найти среднее значение в каждом массива и вывести их на экран
 */

import java.util.Random;

public class task2 {
    static final int LEN = 5;

    public static void main(String[] args) {
        int[] numbers = new int[LEN];
        int[] even = new int[LEN];
        int[] odd = new int[LEN];
        int evenLen = 0;
        int oddLen = 0;
        Random random = new Random();
        for (int i = 0; i < LEN; i++) {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + " ");
            if (numbers[i] % 2 == 0) {
                even[evenLen] = numbers[i];
                evenLen++;
            } else {
                odd[oddLen] = numbers[i];
                oddLen++;
            }
        }
        System.out.println();
        float sum = 0;
        for (int i = 0; i < evenLen; i++) {
            System.out.print(even[i] + " ");
            sum += even[i];
        }
        System.out.printf("%nСреднее значение массива четных чисел: %.2f%n", sum / evenLen);

        sum = 0;
        for (int i = 0; i < oddLen; i++) {
            System.out.print(odd[i] + " ");
            sum += odd[i];
        }
        System.out.printf("%nСреднее значение массива нечетных чисел: %.2f", sum / oddLen);

    }
}
