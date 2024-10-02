package com.practice.sort;

/**
 *Time complexity of Merge Sort is \Theta(nLogn) in all 3 cases (worst, average and best) as merge sort always divides
 * the array into two halves and take linear time to merge two halves.
 *
 * Stable: Yes
 */
public class Merge {

    private static void merge(int[] arr, int l, int r, int mid) {
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l+i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid+1+j];
        }
        //Above two loops can be replced by
        //System.arraycopy(arr, l+0 , left, 0, n1);
        //System.arraycopy(arr, mid+1 , right, 0, n2);


        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[l] = left[i];
                i++;
            } else if (left[i] > right[j] ) {
                arr[l] = right[j];
                j++;
            }
            l++;
        }

        while (i < n1) {
            arr[l] = left[i];
            l++;
            i++;
        }

        while (j < n2) {
            arr[l]= right[j];
            j++;
            l++;
        }
    }

    public static void sort(int[] arr, int i, int j) {

        if (i >= j) {
            return;
        }

        int mid = (i+j)/2;
        sort(arr, i, mid);
        sort(arr, mid+1, j);
        merge(arr, i, j, mid);
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        sort(arr, 0, arr.length-1);
        for (int i1 : arr) {
            System.out.println(i1);
        }
    }

}
