package com.sorting;

import com.commonutils.Utils;

public class MergeSort {

    public static void main(String[] args) {
        int[] inputArr = {4,1,3,9,7};
        Utils.printArray(inputArr);
        System.out.println("After Sorting: ");
        mergeSort(inputArr, 0, inputArr.length-1);
        Utils.printArray(inputArr);
    }

    public static void mergeSort(int[] arr, int l, int r){
        // Merge Sort will divide and compare and rearrange and merge.
        if(l>=r) return;
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);

        mergeArray(arr, l, mid, r);
    }

    public static void mergeArray(int[] arr, int low, int mid, int high){
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        System.arraycopy(arr, low, leftArr, 0, n1);
        System.arraycopy(arr, mid+1, rightArr, 0, n2);
        int i = 0, j = 0, k = low;

        while(i < n1 && j < n2){
            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = leftArr[i];
            k++;
            i++;
        }

        while(j < n2){
            arr[k] = rightArr[j];
            k++;
            j++;
        }
    }

}
