package practice2;
/*
Задание 3. Противоположности притигиваются
- Создайте два массива на 7 элементов.

- Используюте функцию Random.nextInt() чтобы полностью заполнить два массива:
в первом массиве должно оказаться ровно 7 положительных чисел, во втором - ровно 7 отрицательных.
Подсказка: используйте цикл while во время генерации случайных чисел и проверку на заполненность массива, прежде, чем записывать туда элемент.

- Выведите оба массива на экран
- Создайте новый массив на 7 элементов. Значением на каждой позиции является суммой значений на позициях с тем же индексом из положительного и отрицательного массива.
 */

import java.util.Arrays;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        int[] positive = new int[7];
        int[] negative = new int[7];
        int ipos = 0;
        int ineg = 0;
        Random random = new Random();
        while (ipos < 7 || ineg < 7) {
            int number = random.nextInt();
            if (number > 0 && ipos < 7) {
                positive[ipos] = number;
                ipos++;
            } else if (number < 0 && ineg < 7) {
                negative[ineg] = number;
                ineg++;
            }
        }
        System.out.println(Arrays.toString(positive));
        System.out.println(Arrays.toString(negative));
        int[] numbers = new int[7];
        for (int i = 0; i < 7; i++) {
            numbers[i] = positive[i] + negative[i];
        }
    }
}
