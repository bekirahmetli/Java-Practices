package org.example.week3.MyList;

public class Main {
    public static void main(String[] args){
        MyList<Integer> list = new MyList<>();// Create a new MyList instance to store Integer values with default capacity
        System.out.println("Number of Elements in the Array: " + list.size());
        System.out.println("Array Capacity : " + list.getCapacity());
        list.add(10);// Add elements to the list
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Number of Elements in the Array : " + list.size());
        System.out.println("Array Capacity : " + list.getCapacity());
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        System.out.println("Number of Elements in the Array : " + list.size());
        System.out.println("Array Capacity  : " + list.getCapacity());

        // Second example
        MyList<Integer> list2 = new MyList<>();// Second example: Create a new MyList instance for additional operations
        list2.add(10);
        list2.add(20);
        list2.add(30);
        System.out.println("\nValue in the 2nd index : " + list2.get(2));
        list2.remove(2);
        list2.add(40);
        list2.set(0, 100);// Replace the element at index 0 with 100
        System.out.println("Value in the 2nd index : " + list2.get(2));
        System.out.println(list2.toString());

        // Third example
        MyList<Integer> list3 = new MyList<>();// Third example: Create a new MyList instance for various method tests
        System.out.println("\nList Status: " + (list3.isEmpty() ? "Empty" : "Full"));
        list3.add(10);
        list3.add(20);
        list3.add(30);
        list3.add(40);
        list3.add(20);
        list3.add(50);
        list3.add(60);
        list3.add(70);
        System.out.println("List Status : " + (list3.isEmpty() ? "Empty" : "Full"));
        System.out.println("Indeks : " + list3.indexOf(20));
        System.out.println("Indeks :" + list3.indexOf(100));
        System.out.println("Indeks : " + list3.lastIndexOf(20));
        Object[] dizi = list3.toArray();// Convert the list to an array and print the first element
        System.out.println("First element of the Object array :" + dizi[0]);
        MyList<Integer> altListem = list3.sublist(0, 3);// Create a sublist from index 0 to 3
        System.out.println(altListem.toString());
        System.out.println("Value 20 on my list : " + list3.contains(20));
        System.out.println("Value 120 on my list : " + list3.contains(120));
        list3.clear();// Clear the list
        System.out.println(list3.toString());
    }
}
