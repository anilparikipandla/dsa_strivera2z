package com.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {

    public static void main(String[] args) {
        int[] inputArr = {61,61,17};
        ArrayList<Integer> leaders = getLeaderElements(inputArr);
        System.out.println(leaders);
        
    }

    public static ArrayList<Integer> getLeaderElements(int[] arr){
        int len = arr.length;
        int largest = arr[len-1];
        ArrayList<Integer> leaders = new ArrayList<>();

        leaders.add(arr[len-1]);
        for(int i = len-2; i >= 0; i--){
            if(arr[i] >= largest){
                largest = arr[i];
                leaders.add(arr[i]);
            }
        }
        Collections.reverse(leaders);
        return leaders;

    }

}
