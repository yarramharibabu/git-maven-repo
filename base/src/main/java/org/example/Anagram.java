package org.example;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "army";
        String s2 = "mary";
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println();
        if(Arrays.equals(c1, c2))
            System.out.println("main.Anagram");
        else System.out.println("Not main.Anagram");
    }
}