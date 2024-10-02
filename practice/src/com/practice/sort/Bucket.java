package com.practice.sort;

import java.util.*;

/**
 * Bucket sort is mainly useful when input is uniformly distributed over a range.
 * Time complexity:  O(n)
 */
public class Bucket {
    private static void sort(float[] arr) {

        Map<Integer, List<Float>> bucket = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int bucketIndex = (int) (arr[i] * (float)arr.length);
            System.out.println(bucketIndex + " " + arr[i]);
            bucket.computeIfAbsent(bucketIndex, k -> new ArrayList<>());
            bucket.get(bucketIndex).add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            int bucketIndex = (int) (arr[i] * (float)arr.length);
            Collections.sort(bucket.get(bucketIndex));
        }
        int indx = 0;
        Iterator<Map.Entry<Integer, List<Float>>> itr = bucket.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<Integer, List<Float>> entry = itr.next();
            for (int i = 0; i < entry.getValue().size(); i++) {
                arr[indx++] = entry.getValue().get(i);
            }
        }
    }

    public static void main(String[] args) {
        float[] arr = {0.897f, 0.565f, 0.556f, 0.1234f, 0.665f, 0.3434f};
        sort(arr);
        for (float i : arr) {
            System.out.println(i);
        }
    }
}
