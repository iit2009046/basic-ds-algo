package com.practice.sort;

/**
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements
 * if they are in wrong order.
 * <p>
 * Time Complexity: O(n2) as there are two nested loops.
 * Stable: Yes
 */
public class Bubble {

    // average and worst case complexity Ο(n2)
    static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            //after every iteration the highest values settles down at the end of the array
            for (int j = 0; j < (arr.length - i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    static void sort_optimized(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //after every iteration the highest values settles down at the end of the array
            boolean isSorted = true;
            for (int j = 0; j < (arr.length - i - 1); j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = {2, 9, 7, 4, 8, 3};

        sort(arr);
        for (int i1 : arr) {
            System.out.println(i1);
        }

        System.out.println("Sort using optimized algo");
        int[] arr1 = {2, 9, 7, 4, 8, 3};

        sort_optimized(arr1);
        for (int i1 : arr1) {
            System.out.println(i1);
        }
    }


}
