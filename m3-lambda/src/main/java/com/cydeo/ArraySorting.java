package com.cydeo;
import java.lang.reflect.Array;
public class ArraySorting {
    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

        as.sort(qs);

        Sorting quicksort = () -> System.out.println("Quick Sorting");
        as.sort(quicksort);

        as.sort(() -> System.out.println("Quick Sorting"));


    }
    private void sort(Sorting sort){
        System.out.println("Sorting array");
    }
}
