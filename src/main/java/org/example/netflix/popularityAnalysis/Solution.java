package org.example.netflix.popularityAnalysis;

public class Solution {

    public static boolean isMonotonic(int [] arr){

        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < arr.length -1; i++) {
            if(arr[i] > arr[i+1]){
                isIncreasing = false;
            }else{
                isDecreasing = false;
            }
        }


        return isDecreasing || isIncreasing;
    }
}
