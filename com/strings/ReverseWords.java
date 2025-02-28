package com.strings;

public class ReverseWords {

    public static void main(String[] args) {
        String inputStr = "a good   example";
        String outputStr = getReverseWords(inputStr);
        System.out.println(outputStr);
    }

    public static String getReverseWords(String s){
        String[] sArr = s.split(" ");
        StringBuilder outputStr = new StringBuilder();
        for(int i = sArr.length-1; i >= 0; i--){
            if(sArr[i] != ""){
                outputStr.append(" ").append(sArr[i]);
            }
        }
        return outputStr.toString().trim();
    }

}
