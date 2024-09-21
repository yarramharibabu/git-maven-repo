package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayProblems {
    public static void main(String[] args) {
        //using streams
        int[] input = {3, 1, 56, 167, 10000, 2};

        //find min and max in an array.
        System.out.println(Arrays.stream(input).min().getAsInt());
        System.out.println(Arrays.stream(input).max().getAsInt());
        int l = input.length - 1;
        //using Array functions
        Arrays.sort(input);
        System.out.println(input[0]);
        System.out.println(input[l]);

        //reverse Array
        for (int i = 0; i < input.length; i++) {
            int temp = input[i];
            input[i] = input[l];
            input[l] = temp;
            l--;
        }
        for (int i : input)
            System.out.println(i);

        //find frequency of an element in array.
        int[] a = {1, 1, 1, 1, 1, 2};
        int target = 1;
        int count = 0;
        for (int i : a) {
            if (i == target)
                count++;
        }
        System.out.println(count);

        //cyclic array rotation by n place
        int[] ar = {1, 2, 3, 4, 5};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter K");
        int k1 = s.nextInt();
        int n = ar.length;
        if (k1 < 0 || k1 > n)
            return;
        int[] rotatedArray = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArray[(i + k1) % n] = ar[i];
        }
        System.arraycopy(rotatedArray, 0, ar, 0, n);
        for (int i : ar)
            System.out.println(i);

        //missing number in array
        int Arr[] = {1, 2, 4, 5};
        int n1 = Arr.length + 1;
        int expSum = n1 * (n1 + 1) / 2;
        int actSum = 0;
        for (int i : Arr) {
            actSum = actSum + i;
        }
        int missingNum = expSum - actSum;
        System.out.println("missing num is : " + missingNum);

        //pairs with sum in an array
        int[] ap = {6, 2, 5, 1, 3, 9, 5};
        int t = 3;
        int[] toReturn = new int[100];
        Map<Integer, Integer> pMap = new HashMap<>();
        for (int i = 0; i < ap.length; i++) {
            int temp = t - ap[i];
            if (pMap.containsKey(temp))
                toReturn = new int[]{pMap.get(temp), i};
            else
                pMap.put(ap[i], i);
        }
        System.out.println("Array pair is" + Arrays.stream(toReturn)
                .mapToObj(Long::toString)
                .collect(Collectors.joining(",")));

        //duplicate element in an Array
        int arr[] = {2, 3, 1, 2, 3};
        int num = 0;
        Map<Integer, Integer> aMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!aMap.containsKey(arr[i]))
                aMap.put(arr[i], 1);
            else
                aMap.put(arr[i], aMap.get(arr[i]) + 1);
        }
        for (Map.Entry entry : aMap.entrySet()) {
            if (((int) entry.getValue()) > 1) {
                num = (int) entry.getKey();
                System.out.println(num);
            }
        }

        // find common elements in between 3 sorted Arrays
        int[] a1 = {1, 5, 10, 20, 40, 80};
        int[] b2 = {6, 7, 20, 80, 100};
        int[] c2 = {3, 4, 15, 20, 30, 70, 80, 120};
        int l1 = a1.length;
        int l2 = b2.length;
        int l3 = c2.length;
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                for (int k = 0; k < l3; k++) {
                    if (c2[k] == b2[j] && b2[j] == a1[i])
                        System.out.println(c2[k]);
                }
            }

        }


        //first repeating element in Array
        int[] rArr = {1, 3, 5, 4, 3, 5, 6, 1};

        Map<Integer, Integer> fMap = new LinkedHashMap<>();
        for (int i = 0; i < rArr.length; i++) {
            if (!fMap.containsKey(rArr[i]))
                fMap.put(rArr[i], 1);
            else
                fMap.put(rArr[i], fMap.get(rArr[i]) + 1);
        }
        for (Map.Entry entry : fMap.entrySet()) {
            if (((int) entry.getValue()) > 1) {
                System.out.println((int) entry.getKey());
                break;
            }
        }
    }
}