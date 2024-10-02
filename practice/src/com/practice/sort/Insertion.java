package com.practice.sort;

/**
 * Insertion sort is used when number of elements is small. It can also be useful when input array is almost sorted,
 * only few elements are misplaced in complete big array.
 * <p>
 * Time Complexity: O(n*2)
 * stable: Yes
 */
public class Insertion {
    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }


    public static void main(String[] args) {
        int[] arr = {2, 9, 7, 4, 8, 3};

        sort(arr);
        for (int i1 : arr) {
            System.out.println(i1);
        }
    }
}
