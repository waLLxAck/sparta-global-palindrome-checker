package com.sparta.svilen;

public class Printer {
    public static void print(Object object) {
        System.out.println(object);
    }

    public static void printLongestPalindrome(String sentence, String longestPalindrome) {
        System.out.println("The longest palindrome in the sentence:" +
                "\n'" + sentence +
                "'\n ...is: " +longestPalindrome);
    }
}
