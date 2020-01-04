package com.practice.sort;

/**
 * The key process in quickSort is partition(). Target of partitions is, given an array and an element x of array as
 * pivot, put x at its correct position in sorted array and put all smaller elements (smaller than x) before x, and
 * put all greater elements (greater than x) after x. All this should be done in linear time.
 * Best Case:\theta(nLogn)
 * Average Case: O(nLogn)
 * Worst Case:O(n2)
 */
public class Quick {

    private static int partition(int[] arr, int l, int r) {
        int p = r;
        int i = l - 1;
        int j = l;

        while (j < r) {
            if (arr[j] < arr[p]) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            j++;
        }
        int tmp =arr[p];
        arr[p] = arr[i+1];
        arr[i+1] = tmp;
        return i + 1;
    }


    public static void sort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }

        int p = partition(arr, l, r);
        sort(arr, l, p - 1);
        sort(arr, p + 1, r);
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
