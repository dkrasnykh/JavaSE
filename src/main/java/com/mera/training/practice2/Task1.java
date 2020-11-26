package com.mera.training.practice2;
/*
Задание 1. Случайности складываются -
Создать массив на 10 чисел типа int
- Заполнить массив случайными числами, используя класс Random и функцию nextInt()
- Вывести массив на экран одной строкой, разделив элементы пробелом
- Посчитать сумму всех элементов и вывести на экран
- Найти минимальный элемент и вывести на экран его индекс в массиве и значение
 */

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        int sum = 0;
        int imin = 0;
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt();
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
            if (numbers[imin] > numbers[i]) {
                imin = i;
            }
        }
        System.out.printf("%nСумма элементов массива = %d%n", sum);
        System.out.printf("Минимальный элемент: индекс = %d; значение = %d", imin, numbers[imin]);
    }
}
