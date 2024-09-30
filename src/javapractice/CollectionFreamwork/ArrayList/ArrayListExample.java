package javapractice.CollectionFreamwork.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(5);
        list.add(10);
        list.add(3);
        System.out.println("Add Element in Array  = " + list);

        //get elements
        int element = list.get(0);
        int element1 = list.get(2);
        System.out.println("Get elements = ");
        System.out.println(element);
        System.out.println(element1);

        //add element in between
        list.add(1, 4);
        System.out.println("Add element in between Array = " + list);

        //set element
        list.set(1, 22);
        System.out.println("Set element in Array = " + list);

        //delete element
        list.remove(0);
        System.out.println("Remove element in Array = " + list);

        //Size
        int size = list.size();
        System.out.println("Array Size = " + size);

        //loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

            //Sorting
            Collections.sort(list);
            System.out.println(list);
        }
    }
}
