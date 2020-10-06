package com.sparta.svilen;

import javax.xml.validation.Validator;
import java.util.ArrayList;

public class Starter {
    public static void start() {
        //Test cases
        testWord("Hello"); //false
        testWord("ollo"); //true

        testSentence("Bob, this sentence contains a palindrome olo loool"); //loool
        testSentence("This is a wow"); //wow

        testSentence(""); //There are no palindromes in the sentence!
    }

    private static void testSentence(String sentence) {
        if (!returnLongestPalindrome(sentence).equals("")){
            Printer.printLongestPalindrome(sentence, returnLongestPalindrome(sentence));
        }
    }

    private static void testWord(String input) {
        if (palindromeCheck(input)){
            Printer.print(palindromeCheck(input));
        }
    }

    private static String returnLongestPalindrome(String sentence) {
        String[] words = sentence.split("\\s+");
        ArrayList<String> palindromes = new ArrayList<String>();

        String longestPalindrome = "";
        int largestWordIndex;

        for (String word : words) {
            if (palindromeCheck(word)) {
                if (word.length()>longestPalindrome.length()) {
                    longestPalindrome=word;
                }
            }
        }

        if (longestPalindrome.length()>0){
            return longestPalindrome;
        }

        System.err.println("There are no palindromes in the sentence!");
        return "";
    }

    private static boolean palindromeCheck(String input) {
        String reverse = "";

        for (int i = input.length()-1; i >= 0; i--){
            reverse += input.charAt(i);
        }

        return input.equals(reverse);
    }

}
