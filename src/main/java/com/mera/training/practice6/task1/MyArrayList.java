package com.mera.training.practice6.task1;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {
    private Object[] values;
    private int size;

    public MyArrayList() {
        values = new Object[LENGHT];
    }

    @Override
    public void add(T t) {
        if (size < LENGHT) {
            values[size] = t;
            size++;
        } else {
            throw new MyArrayStoreException(String.format("An instance of the 'MyArrayList' class should not contain more than %d elements", LENGHT));
        }
    }

    @Override
    public boolean remove(T t) {
        if (t == null) {
            for (int index = 0; index < size; index++)
                if (values[index] == null) {
                    fastRemove(index);
                    return true;
                }
        } else {
            for (int index = 0; index < size; index++)
                if (t.equals(values[index])) {
                    fastRemove(index);
                    return true;
                }
        }
        return false;
    }

    private void fastRemove(int index) {
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(values, index+1, values, index,
                    numMoved);
        values[--size] = null;
    }

    @Override
    public T[] toArray() {
        return (T[]) Arrays.copyOf(values, size);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new MyArrayStoreException(String.format("Index (%d) is out of bounds of array (length: %d)", index, size));
        }
        return (T) values[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<T> {
        private int ind;

        @Override
        public boolean hasNext() {
            return ind < MyArrayList.this.values.length;
        }

        @Override
        public T next() {
            return (T) MyArrayList.this.values[ind++];
        }
    }

    @Override
    public String toString() {
        return "MyArrayList {" +
                "values=" + Arrays.toString(values) +
                ", size=" + size +
                '}';
    }
}
