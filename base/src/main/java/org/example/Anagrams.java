package org.example;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "The Morse Code";
        String s2 = "Morse The Code";

        s1 = s1.replaceAll("\\s+", "");
        s2 = s2.replaceAll("\\s+", "");

        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();

        if (c1.length != c2.length)
            System.out.println("Not Anagram");

        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i])
                System.out.println("Not Anagram");
        }

        System.out.println("Anagram");

    }
}
