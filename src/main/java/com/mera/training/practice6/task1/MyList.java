package com.mera.training.practice6.task1;

public interface MyList<T> extends Iterable<T>{
    int LENGHT = 10;
    void add(T t);
    boolean remove(T t);
    T[] toArray();
    int size();
    T get(int index);
}
