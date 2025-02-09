package com.zigzagconversion;

public class Zigzagconversion {

    public static void main(String[] args) {
        String input = "PAYPALISHIRING";
        System.out.println("Entry==>");
        String output = printZigZagConversion("A", 2);
        System.out.println("This is a Map");
        System.out.println(output);
    }

    // using HashMap
    // public static String printZigZagConversion(String input, int rows){
    //     int strLen = input.length();
    //     HashMap<Integer, String> map = new HashMap<>();
    //     String result = "";
    //     int totalCharSoFar = 0;
    //     int newCurrentRow = 0;
    //     System.out.println("Total Char so Far: "+ totalCharSoFar);
    //     if(rows == 1)return input;
    //     while(totalCharSoFar < strLen){
    //         System.out.println("in while before check newCurrentRow: "+newCurrentRow);
    //         if(newCurrentRow == rows-1){
    //             for(int i = rows-1; i > 0; i--){
    //                 if(totalCharSoFar >= strLen)break;
    //                 if(map.containsKey(i)){
    //                     map.put(i, map.get(i)+input.charAt(totalCharSoFar));
    //                 }else{
    //                     map.put(i, ""+input.charAt(totalCharSoFar));
    //                 }
    //                 totalCharSoFar++;
    //                 System.out.println("rowEnd Count: "+ newCurrentRow);
    //                 newCurrentRow--;
    //             }
    //         }else{
    //             for(int i = 0; i < rows-1; i++){
    //                 if(totalCharSoFar >= strLen)break;
    //                 if(map.containsKey(i)){
    //                     map.put(i, map.get(i)+input.charAt(totalCharSoFar));
    //                 }else{
    //                     map.put(i, ""+input.charAt(totalCharSoFar));
    //                 }
    //                 System.out.println("rowStart Count: "+ newCurrentRow);
    //                 newCurrentRow++;
    //                 totalCharSoFar++;
    //             }
    //         }
    //     }
    //     for (String value : map.values()) {
    //         result += value;
    //     }
    //     return result;
    // }

    // using String
    public static String printZigZagConversion(String s, int numRows){
        int strLen = s.length();
        String[] map = new String[numRows];
        String result = "";
        int totalCharSoFar = 0;
        int newCurrentRow = 0;
        System.out.println("Total Char so Far: "+ totalCharSoFar);
        if(numRows == 1)return s;
        while(totalCharSoFar < strLen){
            System.out.println("in while before check newCurrentRow: "+newCurrentRow);
            if(newCurrentRow == numRows-1){
                for(int i = numRows-1; i > 0; i--){
                    if(totalCharSoFar >= strLen)break;
                    map[i] = (map[i] == null?"":map[i]) + s.charAt(totalCharSoFar);
                    totalCharSoFar++;
                    System.out.println("rowEnd Count: "+ newCurrentRow);
                    newCurrentRow--;
                }
            }else{
                for(int i = 0; i < numRows-1; i++){
                    if(totalCharSoFar >= strLen)break;
                    map[i] = (map[i] == null?"":map[i]) + s.charAt(totalCharSoFar);
                    System.out.println("rowStart Count: "+ newCurrentRow);
                    newCurrentRow++;
                    totalCharSoFar++;
                }
            }
        }
        for (int x = 0; x < numRows; x++) {
            result += (map[x] == null?"":map[x]);
        }
        return result;
    }
}
