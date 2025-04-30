package com.pingwit_java_course.part14.homework.task2;

public class PalindromeCheck {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "developer";

        System.out.println("Word '" + word1 + "' is Palindrome: " + isPalindrome(word1));
        System.out.println("Word '" + word2 + "' is Palindrome: " + isPalindrome(word2));
    }

    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();

        int length = cleanedStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedStr.charAt(i) != cleanedStr.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}