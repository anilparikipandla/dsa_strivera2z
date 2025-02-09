package com.basicRecursion;

public class Palindrome {
    public static void main(String[] args) {
        boolean status = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(status);
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        return checkForPalindrome(0, s.toCharArray(), s.length());
    }

    public static boolean checkForPalindrome(int start, char[] arr, int end){
        if(start >= end/2) return true;
        if(arr[start] != arr[end-start-1]) return false;
        return checkForPalindrome(start+1, arr, end);
    }

    // Solution 2:
    // is to use while or for loop to iteratre through by using and starting and ending pointers.

}
