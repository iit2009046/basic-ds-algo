package com.practice.sort;

/**
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
 * from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
 * <p>
 * 1) The subarray which is already sorted.
 * 2) Remaining subarray which is unsorted.
 * <p>
 * In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray
 * is picked and moved to the sorted subarray.
 *
 * Time Complexity: O(n2) as there are two nested loops.
 * Stable: No
 *
 */
public class Selection {

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int selectedIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    selectedIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[selectedIndex];
            arr[selectedIndex] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 5, 6, 4, 3, 2, 1};

        sort(arr);

        for (int i1 : arr) {
            System.out.println(i1);
        }
    }
}
