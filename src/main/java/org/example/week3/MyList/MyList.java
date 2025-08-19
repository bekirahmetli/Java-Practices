package org.example.week3.MyList;

public class MyList<T> {
    private T[] array; // Dynamic array to store elements
    private int size; // Number of elements in the array
    private int capacity; // Current capacity of the array

    // Default constructor with initial capacity of 10
    @SuppressWarnings("unchecked")
    public MyList() {
        this.capacity = 10;
        this.size = 0;
        this.array = (T[]) new Object[capacity]; // Cast Object array to generic type
    }

    // Constructor with custom initial capacity
    @SuppressWarnings("unchecked")
    public MyList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative");
        }
        this.capacity = capacity;
        this.size = 0;
        this.array = (T[]) new Object[capacity]; // Cast Object array to generic type
    }

    // Returns the number of elements in the list
    public int size() {
        return size;
    }

    // Returns the current capacity of the list
    public int getCapacity() {
        return capacity;
    }

    // Adds an element to the list, doubles capacity if full
    @SuppressWarnings("unchecked")
    public void add(T data) {
        if (size == capacity) {
            capacity *= 2;
            T[] newArray = (T[]) new Object[capacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size++] = data;
    }

    // Returns the element at the specified index, null if index is invalid
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }

    // Removes the element at the specified index and shifts elements, null if index is invalid
    @SuppressWarnings("unchecked")
    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        T removedElement = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--size] = null;
        return removedElement;
    }

    // Sets the element at the specified index, null if index is invalid
    public T set(int index, T data) {
        if (index < 0 || index >= size) {
            return null;
        }
        T oldValue = array[index];
        array[index] = data;
        return oldValue;
    }

    // Returns a string representation of the list
    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(array[i]).append(",");
        }
        sb.append(array[size - 1]).append("]");
        return sb.toString();
    }

    // Returns the index of the first occurrence of the specified element, -1 if not found
    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    // Returns the index of the last occurrence of the specified element, -1 if not found
    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    // Returns true if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Returns an array containing all elements in the list
    @SuppressWarnings("unchecked")
    public T[] toArray() {
        T[] newArray = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    // Clears the list and resets to default capacity
    @SuppressWarnings("unchecked")
    public void clear() {
        this.capacity = 10;
        this.size = 0;
        this.array = (T[]) new Object[capacity];
    }

    // Returns a sublist from start to finish index (exclusive)
    @SuppressWarnings("unchecked")
    public MyList<T> sublist(int start, int finish) {
        if (start < 0 || finish > size || start >= finish) {
            return null;
        }
        MyList<T> sublist = new MyList<>(finish - start);
        for (int i = start; i < finish; i++) {
            sublist.add(array[i]);
        }
        return sublist;
    }

    // Returns true if the list contains the specified element
    public boolean contains(T data) {
        return indexOf(data) != -1;
    }
}
