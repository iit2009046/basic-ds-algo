package com.practice.sort;

/**
 * Heap sort is a comparison based sorting technique based on Binary Heap data structure. It is similar to selection
 * sort where we first find the maximum element and place the maximum element at the end. We repeat the same process
 * for remaining element.
 *
 * Time complexity of heapify is O(Logn)
 */
public class Heap {

    //Build max heap
    private static void heapify(int[] arr, int n, int i) {
        int l = 2 * i + 1; // left child
        int r = 2 * i + 2; //right child


        int max_index = i;
        if (l < n && arr[l] > arr[i]) {
            max_index = l;
        }
        if (r < n && arr[r] > arr[max_index]) {
            max_index = r;
        }
        if (max_index != i) {
            int tmp = arr[i];
            arr[i] = arr[max_index];
            arr[max_index] = tmp;
            heapify(arr, n, max_index);
        }
    }

    static void sort(int[] arr) {

        //Bring the largest element at front
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            heapify(arr, i, 0);
        }
    }


    public static void main(String[] args) {
        int[] arr = {2, 9, 7, 4, 8, 3};
        sort(arr);
        for (int i:arr) {
            System.out.println(i);
        }
    }
}
