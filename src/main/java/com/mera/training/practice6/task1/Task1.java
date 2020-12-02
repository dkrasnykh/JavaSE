package com.mera.training.practice6.task1;
/*
Создать свой класс MyArrayList, который хранит максимум 10 объектов любого типа (по аналогии с ArrayList).
Если попытаться добавить больше, чем 10 элементов, то должно выкинуться unchecked исключение - MyArrayStoreException.
Используйте обощенный класс для этого (generic) с типом T.

- Реализуйте методы:
1. void add(T) - добавляет элемент в коллекцию
2. boolean remove(T) - возвращает true, если элемент был найден и удален
3. T[] toArray() - возвращает массив из всех текущих элементов
4. int size()
5. T get(int) - взять элемент по индексу.
 */

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("str0");
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        list.add("str5");
        list.add("str6");
        list.add("str7");
        list.add("str8");
        list.add("str9");
        System.out.println(list);
        list.remove("str4");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(Arrays.toString(list.toArray()));

        for(String l : list){
            System.out.print(l + " ");
        }

        System.out.println();
        System.out.println(list.size());
        System.out.println(list.get(15));
    }
}
