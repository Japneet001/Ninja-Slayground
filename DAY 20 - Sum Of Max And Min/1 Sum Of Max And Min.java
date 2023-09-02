/*  You are given an array "ARR” of size N. Your task is to find out the sum of maximum and minimum elements in the array.
    Follow Up:
        Can you do the above task in a minimum number of comparisons? 
*/

import java.util.* ;
import java.io.*; 

public class Solution {
    public static int sumOfMaxMin(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max + min;
    }
}