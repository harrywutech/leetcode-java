package SortingFundamental;

import LinearSearch.Student;
import Tools.ArrayGenerator;
import Tools.SortingHelper;

import java.sql.SQLOutput;

public class SelectionSort {
    private SelectionSort() {}
    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //select arr[i...n) minimal index
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j].compareTo(arr[minIndex]) < 0)
                    minIndex = j;
            }
            swap(arr, i, minIndex);
        }
    }
    private static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {

        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {
            Integer[] arr= ArrayGenerator.generateRamdomArray(n, n);
            SortingHelper.sortTest("SelectionSort", arr);
        }
    }
}
